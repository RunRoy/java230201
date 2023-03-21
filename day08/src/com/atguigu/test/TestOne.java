package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        // static关键字修饰类的成员
        // static修饰的属性叫静态属性，static修饰的方法叫静态方法
        // static修饰的属性可以无需创建对象，由类名直接调用，也可以由对象名调用静态属性，但是不推荐
        // 静态属性是类的所有对象共用一个，所以也叫类变量。普通属性是每个对象自己一套，对象间不互相影响
        // 静态方法可以由类名直接调用无需创建对象，也可以由对象名调用但不推荐
        Student.school = "尚硅谷";
        Student stu = new Student();
        stu.stuName = "Tom";
        stu.stuAge = 20;
        stu.school = "尚硅谷";
        Student stu1 = new Student();
        stu1.stuName = "Jerry";
        stu1.stuAge = 21;
        stu1.school = "清华";
        System.out.println(stu.getInfo());
        System.out.println(stu1.getInfo());
        Student.methodOne();
        stu.methodOne();
    }
}
