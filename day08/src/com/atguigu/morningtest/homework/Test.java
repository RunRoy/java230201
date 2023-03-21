package com.atguigu.morningtest.homework;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-11 18:28
 */
public class Test {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Scanner input = new Scanner(System.in);
        Employee[] arr = new Employee[2];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("--------添加第" + (i +1) + "名员工-----------");
            System.out.println("请输入员工姓名：");
            String name = input.next();
            System.out.println("请输入员工性别");
            String gender = input.next();
            System.out.println("请输入员工年龄");
            int age = input.nextInt();
            System.out.println("请输入员工薪资");
            int salary = input.nextInt();
            System.out.println("请输入员工电话");
            String phone = input.next();
            System.out.println("请输入员工邮箱");
            String emil = input.next();

            emp.setName(name);
            emp.setGender(gender);
            emp.setAge(age);
            emp.setSalary(salary);
            emp.setPhone(phone);
            emp.setEmail(emil);

            arr[i] = emp;
        }
        System.out.println("添加完成");
        for (int i = 0; i < arr.length;i++) {
            System.out.println(emp.getInfo());
        }


    }
}
