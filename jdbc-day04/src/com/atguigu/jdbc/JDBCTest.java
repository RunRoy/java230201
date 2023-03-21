package com.atguigu.jdbc;

import org.junit.Test;

import java.sql.*;

/**
 * 包名:com.atguigu.jdbc
 * @author Leevi
 * 日期2023-03-08  11:20
 */
public class JDBCTest {
    @Test
    public void test01() throws SQLException, ClassNotFoundException {
        //目标:查询atguigu.t_department表中的所有内容，并打印出来
        //1. 注册驱动:告诉应用程序使用的是哪个驱动类
        //DriverManager.registerDriver(new Driver());
        Class.forName("com.mysql.cj.jdbc.Driver"); //获取com.mysql.cj.jdbc.Driver类的Class类型对象，让类一定加载

        //2. 建立连接(连接到MySQL Server)
        //jdbc:mysql://协议，连接MySQL Server得指定通信协议 ，localhost:3306 Server的地址，atguigu数据库名，serverTimezone=UTC  MySQL驱动8以后需要加
        //String url = "jdbc:mysql://localhost:3306/atguigu?serverTimezone=UTC";
        //简写:如果是连接本地的3306端口，那么可以省略localhost:3306
        String url = "jdbc:mysql:///atguigu?serverTimezone=UTC";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3. 创建Statement对象,用来将SQL发送到MySQL Server进行执行
        Statement statement = connection.createStatement();
        //4. 编写SQL语句，使用statement对象执行SQL语句:executeQuery()执行查询的SQL语句，executeUpdate()方法执行增删改的SQL语句
        String sql = "SELECT * FROM t_department";
        //execute():执行查询的SQL,必须还得配合getResultSet()获取到查询的结果集;它也可以执行DML,配合getUpdateCount()可以获取受到影响的行数
        //executeQuery():返回值就是resultSet对象，执行查询的SQL
        //executeUpdate():返回值是int类型，表示受到影响的行数
        ResultSet resultSet = statement.executeQuery(sql);

        //5. 解析结果集，获取查询的结果
        while (resultSet.next()) {
            int did = resultSet.getInt("did");
            String dname = resultSet.getString("dname");
            String description = resultSet.getString("description");

            System.out.println(did + ":" + dname + ":" + description);
            System.out.println("============================================");
        }

        //6. 关闭资源
        resultSet.close();
        statement.close();
        connection.close();
    }

    @Test
    public void test02() throws ClassNotFoundException, SQLException {
        //目标:执行insert语句
        //1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. 创建连接
        String url = "jdbc:mysql:///atguigu?serverTimezone=UTC";
        String user = "root";
        String password = "12345678";
        Connection connection = DriverManager.getConnection(url, user, password);
        //3. 创建Statement对象
        Statement statement = connection.createStatement();
        //4. 编写SQL，并且使用Statement对象执行SQL
        String sql = "INSERT INTO t_account (account_name,money) VALUES ('aolafu',1000)";
        int rowNum = statement.executeUpdate(sql);
        System.out.println(rowNum);
        //5. 如果是执行的DQL，那么就要解析ResultSet
        //6. 释放资源
        statement.close();
        connection.close();
    }

    @Test
    public void test03() throws ClassNotFoundException, SQLException {
        //我要干啥?目标:执行一个UPDATE语句，将id为5的账号的money + 500
        //1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. 创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigu?serverTimezone=UTC", "root", "12345678");
        //3. 创建Statement对象，用于执行SQL
        Statement statement = connection.createStatement();
        //4. 编写SQL，并使用Statement执行
        String sql = "UPDATE t_account SET money=money - 500 WHERE account_id=5";
        int rowNum = statement.executeUpdate(sql);
        System.out.println(rowNum);
        //5. 关闭资源
        statement.close();
        connection.close();
    }

    @Test
    public void test04() throws ClassNotFoundException, SQLException {
        //目标:执行根据account_id删除5的账号
        //1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. 创建连接
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atguigu?serverTimezone=UTC", "root", "12345678");
        //3. 创建Statement对象，用于执行SQL
        Statement statement = connection.createStatement();
        //4. 编写SQL，并使用Statement执行
        String sql = "DELETE FROM t_account WHERE account_id=5";
        int rowNum = statement.executeUpdate(sql);
        System.out.println(rowNum);
        //5. 关闭资源
        statement.close();
        connection.close();
    }

    @Test
    public void test05() throws ClassNotFoundException, SQLException {
        //目标:查询account_id为4的账号信息
        //1. 注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2. 创建连接
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/atguigu?serverTimezone=UTC", "root", "12345678");
        //3. 创建Statement对象，用于执行SQL
        Statement statement = connection.createStatement();
        //4. 编写SQL，并使用Statement执行
        String sql = "SELECT * FROM t_account WHERE account_id=3";
        ResultSet rst = statement.executeQuery(sql);

        //5. 解析结果集
        while (rst.next()) {
            int accountId = rst.getInt("account_id");
            String accountName = rst.getString("account_name");
            int money = rst.getInt("money");
            System.out.println(accountId + ":" + accountName + ":" + money);
            System.out.println("============================================");
        }

        //6. 关闭资源
        rst.close();
        statement.close();
        connection.close();
    }
}
