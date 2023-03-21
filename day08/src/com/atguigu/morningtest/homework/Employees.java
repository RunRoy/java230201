package com.atguigu.morningtest.homework;

/** 普通员工类
 * @author lystart
 * @create 2023-02-12 0:18
 */
public class Employees {

    private int id;
    private String name;
    private int age;
    private int salary;

    public Employees() {
    }

    public Employees(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String say(){
        return "编号" + id + "姓名" + name + "年龄" + age + "工资" + salary;
    }

    public String getInfo(){
        return say();
    }

}
