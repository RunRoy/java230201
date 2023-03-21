package com.atguigu.morningtest.homework;

import sun.plugin2.util.NativeLibLoader;

/**
 * @author lystart
 * @create 2023-02-11 18:14
 */
public class Employee {
    private String name;
    private String gender;
    private int age;
    private int salary;
    private String phone;
    private String email;

    public Employee(String name, String gender, int age, int salary, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
        this.email = email;
    }

    public String getInfo( ){
        return "姓名" + name + "性别" + gender + "年龄" + age +  "工资" + salary +
                "电话" + phone +  "邮箱" + email;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
