package com.atguigu.morningtest.homework.Exe1;

import com.atguigu.morningtest.homework.Exe1.Employee;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-13 18:01
 */
public class Test1 {
    public static void main(String[] args) {
    Employee[] emp = new Employee[2];
        Employee employee = new Employee();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < emp.length; i++) {
            System.out.println("--------请输入第" + (i+1) + "名员工--------");
            emp[i] = new Employee();
            System.out.println("请输入姓名:");
            String name = input.next();
            System.out.println("请输入性别:");
            String gender = input.next();
            System.out.println("请输入年龄：");
            int age = input.nextInt();
            System.out.println("请输入工资");
            double salary = input.nextDouble();
            System.out.println("请输入电话");
            String phone = input.next();
            System.out.println("请输入邮箱");
            String emil = input.next();

            emp[i].setName(name);
            emp[i].setGender(gender);
            emp[i].setAge(age);
            emp[i].setSalary(salary);
            emp[i].setPhone(phone);
            emp[i].setEmil(emil);

            emp[i] = employee;

        }
        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getInfo());
        }
    }
}
