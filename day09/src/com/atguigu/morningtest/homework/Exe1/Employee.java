package com.atguigu.morningtest.homework.Exe1;

/**
 * @author lystart
 * @create 2023-02-13 17:57
 */
public class Employee {
    private String name;
    private String gender;
    private int age;
    private double salary;
    private String phone;
    private String emil;

    public Employee() {
    }

    public Employee(String name, String gender, int age, double salary, String phone, String emil) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.phone = phone;
        this.emil = emil;
    }

    public String getInfo() {
        return "Employee{" +
                "姓名='" + name + '\'' +
                ", 性别='" + gender + '\'' +
                ", 年龄=" + age +
                ", 工资=" + salary +
                ", 电话='" + phone + '\'' +
                ", 邮箱='" + emil + '\'' +
                '}';
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmil() {
        return emil;
    }

    public void setEmil(String emil) {
        this.emil = emil;
    }
}
