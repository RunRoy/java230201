package com.atguigu.test;

public class Student {
    // 属性
    public String name;
    public int age;
    public String gender;
    // 方法
    // 一个方法包含五个常规部分，和两个非常规部分
    // 五个常规部分：访问修饰符，返回类型，方法名，参数组，方法体
    // 访问修饰符：修饰类的成员，public protected 缺省 private
    // 访问修饰的作用是控制成员的可见性
    // 返回类型：方法返回值的类型
    public void sayHello(){
        study();
        System.out.println("你好，我叫"+name+"，我今年"+age+"岁，我是一名"+gender+"同学");
        return;// void方法可以写return但不能返回值
    }

    public void study(){
        System.out.println("好好学习，天天向上");
        sayHello();
    }
}
