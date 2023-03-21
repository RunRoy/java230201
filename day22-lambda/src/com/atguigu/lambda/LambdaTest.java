package com.atguigu.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 包名:com.atguigu.lambda
 *
 * @author Leevi
 * 日期2023-03-03  08:39
 * 函数式接口对应的匿名内部类才能用Lambda简化,什么是函数式接口?
 * 1. 有@FunctionalInterface注解
 * 2. 有且只有一个抽象方法
 *
 * Lambda的语法:
 * 1. 不关注类名、方法名
 * 2. 不关注方法的返回值返回值类型、参数类型
 * 3. 在参数列表与方法体之间加上箭头符 ->
 * 4. 其它的简化写法:
 *    4.1 如果方法体只有一行代码，那么可以省略方法体的大括号，一行代码的方法体如果省略了大括号，那么就一定要省略return，一定要省略方法体最后的分号
 *    4.2 如果只有一个参数，可以省略小括号
 *
 * Lambda是对函数式接口的匿名内部类对象的简化，方法引用和构造器引用又是对Lambda的简化
 * 1. 方法引用
 *   1.1 使用条件
 *      1.1.1 Lambda的方法体只有一行代码
 *      1.1.2 Lambda的方法体中刚好是对象调用方法，或者是类调用静态方法
 *      1.1.2 Lambda的方法体中刚好使用了方法的形参列表
 *   1.2 方法引用的格式:
 *      1.2.1 类名 :: 方法名
 *      1.2.2 对象 :: 方法名
 * 2. 构造器引用
 *   2.1 使用条件
 *      2.1.1 Lambda的方法体只有一行代码
 *      2.1.2 Lambda的这一行代码是创建对象或者是创建数组
 *      2.1.3 形参是创建对象时候的实参，或者形参是创建数组时候的长度
 *   2.2 构造器引用的格式:
 *      2.2.1 类名 :: new
 *      2.2.2 数组类型 :: new
 */
public class LambdaTest {
    @Test
    public void test01(){
        //Lambda的作用是什么。
        //1. 如果不用Lambda
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello new Thread..." + Thread.currentThread().getId());
            }
        }).start();

        //2. 如果使用Lambda
        new Thread(() -> {
            System.out.println("hello new Thread..." + Thread.currentThread().getId());
        }).start();
    }

    @Test
    public void test02(){
        /*int num = CalculatorManager.invokeCalculate(1, 2, new Calculator() {
            @Override
            public int cal(int a, int b) {
                return a + b;
            }
        });*/


        int num = CalculatorManager.invokeCalculate(1, 2,
            (a,b) -> a + b);
        System.out.println(num);
    }

    @Test
    public void test03(){
        //1. 构建一个集合
        List<String> list = Arrays.asList("java","c","python","c++","VB","C#");
        //2. 遍历集合:使用Collection的forEach()方法进行遍历
        list.forEach(t -> System.out.println(t));
    }

    @Test
    public void test04(){
        //1. 构建一个Map
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "java");
        map.put(2, "c");
        map.put(3, "python");
        map.put(4, "c++");
        map.put(5, "VB");
        map.put(6, "C#");

        //2. 遍历Map
        map.forEach((k,v) -> System.out.println(k+":"+v));
    }

    @Test
    public void test05(){
        //1. 构建一个Map
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1, "java");
        map.put(2, "c");
        map.put(3, "python");
        map.put(4, "c++");
        map.put(5, "VB");
        map.put(6, "C#");

        //这个方法叫替换所有:接收一个功能型接口
        map.replaceAll((k,v) -> {
            //处理k、v:如果k大于3，则将v拼接hello，否则v不变
            //返回值表示替换之后的新v
            if(k > 3){
                return "hello:"+v;
            }else {
                return v;
            }
        });

        System.out.println(map);
    }

    @Test
    public void test06(){
        //构建一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("atguigu");
        list.add("ok");
        list.add("yes");

        //目标:删除集合中长度大于4的元素
        list.removeIf(element -> element.length() > 4);
        System.out.println(list);
    }

    @Test
    public void test07(){
        EmployeeManager employeeManager = new EmployeeManager();
        //所有员工对象
        //List<Employee> employeeList = employeeManager.get(employee -> true);

        //所有年龄超过35的员工
        /*List<Employee> employeeList = employeeManager.get(employee -> {
            return employee.getAge() > 35;
        });*/

        //所有薪资高于15000的女员工
        //List<Employee> employeeList = employeeManager.get(employee -> employee.getSalary() > 15000 && employee.getGender() == '女');

        //所有编号是偶数的员工
        //List<Employee> employeeList = employeeManager.get(employee -> employee.getId() % 2 == 0);

        //名字是“张三”的员工
        //List<Employee> employeeList = employeeManager.get(employee -> employee.getName().equals("张三"));

        //年龄超过25，薪资低于10000的男员工
        List<Employee> employeeList = employeeManager.get(employee -> employee.getAge() > 25 && employee.getSalary() < 10000 && employee.getGender() == '男');
        System.out.println(employeeList);
    }

    @Test
    public void test08(){
        //声明一个集合
        List<String> list = Arrays.asList("cc","ww","aa","bb","dd");
        //遍历打印集合
        //1. 方法体只有一行代码  2. 方法体是对象调用方法 3. 刚好只用到了方法的形参
        //list.forEach(item -> System.out.println(item));

        list.forEach(System.out :: println);

        //list.sort((s1,s2) -> {return s1.compareTo(s2);});

        list.sort(String :: compareTo);

        System.out.println(list);
    }

    @Test
    public void test09(){
        //测试构造器引用
        EmployeeManager employeeManager = new EmployeeManager();

        //employeeManager.add(() -> new Employee());
        employeeManager.add(Employee :: new);

        System.out.println(employeeManager.get(employee -> true));
    }
}
