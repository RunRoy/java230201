package com.atguigu.test;

import java.util.Scanner;

public class TestSeven {
    public static void main(String[] args) {
        // 类是对象的类型，对象是类的实例
        // 如果想使用一个类的属性或者方法，需要先创建该类对象，再由对象调用属性和方法
        // input叫对象名或者叫引用，stu是个对象名或者叫引用
        Scanner input = new Scanner(System.in);
        System.out.println(input);

        // 属性是属于类的，属性的值是属于对象的
        // 属性有默认初始值，局部变量没有默认初始值
        Student stu = new Student();
        System.out.println(stu);
        stu.name = "Tom";
        stu.age = 20;
        stu.gender = "男";
        stu.sayHello();

        // 一个类在通常情况下可以创建任意多个对象
        Student stu1 = new Student();
        stu1.name = "Jerry";
        stu1.age = 21;
        stu1.gender = "男";
        stu1.sayHello();

    }
}
