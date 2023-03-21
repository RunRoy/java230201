package com.atguigu.test;

public class Student {
    public String stuName;
    public int stuAge;
    public static String school;

    public String getInfo(){
        System.out.println(stuName);
        System.out.println(school);
        methodOne();
        System.out.println(this);
        return "学生名："+stuName+"，学生年龄："+stuAge+"，所在学校："+school;
    }

    // 静态方法可以由类名直接调用无需创建对象，也可以由对象名调用但不推荐
    // 静态成员只能访问静态成员，不能访问普通成员。普通成员可以访问静态成员也可以访问普通成员
    public static void methodOne(){
        Student stu = new Student();
        stu.getInfo();
        System.out.println(stu.stuName);
        // System.out.println(this);// 静态成员中不能出现this关键字
        System.out.println(school);
        System.out.println("in Student static methodOne()");
    }
}
