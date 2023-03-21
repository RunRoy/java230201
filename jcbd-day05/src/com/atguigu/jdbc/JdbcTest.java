package com.atguigu.jdbc;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

/**
 * 包名:com.atguigu.jdbc
 *
 * @author Leevi
 * 日期2023-03-10  08:37
 */
public class JdbcTest {
    /*public static void main(String[] args) throws SQLException {
        //需求:根据dname查询部门信息，并且将查询到的结果封装到Department对象中
        //1. 注册驱动(可以不注册驱动,因为DriverManager内部会自动注册驱动,利用Java的SPI机制),这个地方打破了类加载器的双亲委派机制
        //2. 获得连接
        String url = "jdbc:mysql:///atguigu?serverTimezone=UTC";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3. 创建Statement对象
        Statement statement = connection.createStatement();
        //4. 编写并执行SQL
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要查询的部门的名称:");
        String name = scanner.nextLine();
        //由于拼接字符串SQL的时候，可能会导致SQL的结构发生变化，从而改变查询的结果，这种情况就叫做SQL注入
        String sql = "select * from t_department where dname = '" + name +"'";
        System.out.println(sql);
        ResultSet resultSet = statement.executeQuery(sql);
        //5. 解析结果集
        if (resultSet.next()) {
            //获取第一行的数据
            int did = resultSet.getInt("did");
            String dname = resultSet.getString("dname");
            String description = resultSet.getString("description");
            Department department = new Department(did, dname, description);
            System.out.println(department);
        }
        //6. 释放资源
        resultSet.close();
        statement.close();
        connection.close();
    }*/

    public static void main(String[] args) throws SQLException {
        //解决SQL注入:在执行SQL之前先进行预编译
        //SQL的执行流程:连接、接收Statement、对Statement进行编译(解析成一棵语法树)、优化SQL并生成执行计划、执行引擎执行SQL
        //目前有如下的一些问题:
        //1. 如果一个SQL执行多次，那么它就会编译多次，这样会降低SQL的执行效率
        //2. 因为编译是发生在SQL拼接之后，SQL拼接有可能改变SQL语句的结构，所以SQL注入的风险

        //怎么解决目前存在的问题:采用PreparedStatement进行预编译
        //1. 获得连接
        String url = "jdbc:mysql:///atguigu?serverTimezone=UTC";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);
        //2. 创建Statement的子接口PreparedStatement类型的对象
        String sql = "select * from t_department where dname = ?";
        //此时这个SQL已经预编译了
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //3. 拼接参数
        //3.1 获取参数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想要查询的部门的名称:");
        String name = scanner.nextLine();

        //3.2 由preparedStatement设置参数
        preparedStatement.setString(1,name);

        //4. 执行SQL
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            //获取第一行的数据
            int did = resultSet.getInt("did");
            String dname = resultSet.getString("dname");
            String description = resultSet.getString("description");
            Department department = new Department(did, dname, description);
            System.out.println(department);
        }
        //5. 释放资源
        resultSet.close();
        preparedStatement.close();
        connection.close();
    }
    @Test
    public void test01() throws SQLException {
        //目标:新增一个部门，新增一个job，然后往该部门中新增一个该job的员工，这个操作需要在一个方法内完成
        //1. 获得连接
        String url = "jdbc:mysql:///atguigu?serverTimezone=UTC";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);

        //开启事务
        connection.setAutoCommit(false);

        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        PreparedStatement preparedStatement3 = null;
        ResultSet resultSet = null;
        ResultSet resultSet2 = null;

        try {
            //2. 编写SQL
            String sql1 = "insert into t_job (jname, description) values ('公关经理','客户至上，客户不倒我不倒')";
            String sql2 = "insert into t_department (description, dname) VALUES ('负责把客户陪好','公关部')";
            String sql3 = "insert into t_employee (ename, salary, commission_pct, birthday, gender, tel, email, address, work_place, hiredate, job_id, mid, did) VALUES ('凯特琳',30000,0.1,'2003-03-10','女','18999999999','18999999999@163.com','皮尔特沃夫','北京','2022-01-23',?,1,?)";
            //3. 预编译SQL
            //预编译sql1,需要获取自增长的主键值
            preparedStatement1 = connection.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
            preparedStatement2 = connection.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
            preparedStatement3 = connection.prepareStatement(sql3);
            //4. 执行sql1和sql2,并获取自增长主键值
            //4.1 执行sql1，获取自增长主键值
            preparedStatement1.executeUpdate();
            resultSet = preparedStatement1.getGeneratedKeys();
            if (resultSet.next()) {
                int job_id = resultSet.getInt(1);
                //设置sql3的第一个参数
                preparedStatement3.setInt(1,job_id);
            }
            //4.2 执行sql2,获取自增长id
            preparedStatement2.executeUpdate();
            resultSet2 = preparedStatement2.getGeneratedKeys();
            if (resultSet2.next()) {
                int did = resultSet2.getInt(1);
                //设置sql3的第一个参数
                preparedStatement3.setInt(2,did);
            }
            //5. 执行sql3
            preparedStatement3.executeUpdate();

            // 提交事务
            connection.commit();
        } catch (Exception e) {
            //回滚事务
            connection.rollback();
            throw new RuntimeException(e);
        } finally {
            //6. 释放资源
            resultSet.close();
            resultSet2.close();
            preparedStatement1.close();
            preparedStatement2.close();
            preparedStatement3.close();
            connection.close();
        }
    }

    @Test
    public void test02() throws SQLException {
        //批处理:批量进行新增、删除、查询等等操作,使用批处理会提升执行效率
        //演示给job表新增10000条数据
        //先演示不使用批处理，也不使用事务的情况:36049毫秒，这种情况会提交10000次事务，每次提交事务都要写bin-log、redo-log，进行刷盘，所以执行肯定慢
        //加入事务，但是不使用批处理的情况:6580毫秒，这种情况只会提交一次事务但是也执行了10000个SQL，所以bin-log、redo-log的刷盘只有一次
        //即加事务，又使用批处理的情况:2941毫秒,这种情况相当于将要添加的10000条数据放到一个大SQL中，这种情况只提交了一次事务、也只执行了一个SQL
        //1. 获得连接
        long startTime = System.currentTimeMillis();
        //rewriteBatchedStatements=true开启批处理
        String url = "jdbc:mysql:///atguigu?serverTimezone=UTC&rewriteBatchedStatements=true";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);

        //开启事务
        connection.setAutoCommit(false);

        String sql = "insert into t_job (jname, description) values (?,?)";
        //预编译
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //设置参数并执行
        for (int i = 0; i < 10000; i++) {
            //设置参数
            preparedStatement.setString(1,"aaa"+i);
            preparedStatement.setString(2,"aaa"+i);
            //将参数加入批处理中
            preparedStatement.addBatch();
        }
        //执行SQL
        preparedStatement.executeBatch();
        //提交事务
        connection.commit();
        //释放资源
        preparedStatement.close();
        connection.close();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    @Test
    public void test03() throws Exception {
        //druid连接池的使用
        //1. 引入依赖  2. 配置参数   3. 使用连接池获取连接
        //1. 创建连接池对象
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        properties.load(in);

        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

        //2. 从连接池中获取连接
        Connection connection1 = dataSource.getConnection();
        Connection connection2 = dataSource.getConnection();
        Connection connection3 = dataSource.getConnection();
        Connection connection4 = dataSource.getConnection();
        Connection connection5 = dataSource.getConnection();
        Connection connection6 = dataSource.getConnection();
        Connection connection7 = dataSource.getConnection();
        Connection connection8 = dataSource.getConnection();
        Connection connection9 = dataSource.getConnection();
        Connection connection10 = dataSource.getConnection();
        Connection connection11 = dataSource.getConnection();
        Connection connection12 = dataSource.getConnection();
        Connection connection13 = dataSource.getConnection();

        //归还连接:底层使用动态代理技术，在程序运行时动态修改方法
        connection10.close();

        Connection connection14 = dataSource.getConnection();
    }

    @Test
    public void test04() throws SQLException {
        //1. 获得连接
        Connection connection = JDBCUtil.getConnection();
        //2. 预编译SQL
        String sql = "insert into t_account (account_name,money) values (?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //3. 设置参数
        preparedStatement.setString(1,"tq");
        preparedStatement.setInt(2,12000);

        //4. 执行SQL
        preparedStatement.executeUpdate();

        //5. 释放资源
        preparedStatement.close();
        connection.close();
    }

    @Test
    public void test05() throws SQLException {
        //Apache DBUtils工具:简化JDBC代码,让你可以用两行代码执行任何SQL语句
        //1. 创建QueryRunner对象
        QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());

        //2. 使用queryRunner执行SQL
        //先演示执行增删改的SQL
        String sql = "insert into t_account (account_name,money) values (?,?)";
        int i = queryRunner.update(sql, "wb", 11000);
        System.out.println(i);
    }

    @Test
    public void test06() throws SQLException {
        //使用DBUtils执行查询的SQL 与 执行增删改的语句的区别在哪? 执行查询的SQL它需要给你处理结果集
        //我们查询有多少种结果集类型?
        //1. 单个(一行一列)数据作为结果集: 例如查询account_id为1的那条数据的account_name的值。例如查询账号总数量。像这种单个数据的结果集就使用简单类型(String、基本类型)接收
        //2. 一行数据作为结果集: 例如根据id等值查询账户信息。像这种结果集就使用JavaBean对象，或者使用Map接收
        //3. 多行数据作为结果集: 例如查询所有账户信息。例如查询id大于1的所有账户信息。像这种结果集就使用List<JavaBean>或者List<Map>接收
        //4. 一列多行数据作为结果集: 例如查询所有账户的account_id。像这种结果集就使用List<简单类型>
        //在DBUtils中内置了很多的结果集处理器，你想要处理哪种结果集，就指定QueryRunner使用哪种结果集处理器

        //目标1:查询t_account表的账号的数量
        QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());
        String sql1 = "select count(0) from t_account";
        Long count = queryRunner.query(sql1, new ScalarHandler<Long>());
        System.out.println(count);

        //目标2:根据account_id查询账户信息 ------>JavaBean、或者Map
        String sql2 = "select account_id accountId,account_name accountName,money from t_account where account_id=?";
        //封装到Map中
        /*Map<String, Object> map = queryRunner.query(sql2, new MapHandler(), 1);
        System.out.println(map);*/
        //封装到JavaBean中:底层封装的时候，要求JavaBean的属性名和类型，必须和结果集的字段名和类型一致
        Account account = queryRunner.query(sql2, new BeanHandler<>(Account.class), 1);
        System.out.println(account);

        //目标3:查询所有账户信息 -----> List<Account>或者List<Map>
        String sql3 = "select account_id accountId,account_name accountName,money from t_account";
        List<Account> accountList = queryRunner.query(sql3, new BeanListHandler<>(Account.class));
        System.out.println(accountList);

        //目标4:查询所有账户的account_id ------> List<Integer>
        String sql4 = "select account_id from t_account";
        List<Integer> accountIdList = queryRunner.query(sql4, new ColumnListHandler<Integer>());
        System.out.println(accountIdList);
    }
}
