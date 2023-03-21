package com.atguigu.morningtest;

public class Student {
    public String stuName;
    public int stuAge;
    public String stuGender;

    public void sayHello(){
        System.out.println("你好，我叫"+stuName+"，我今年"
                +stuAge+"岁，我是一名"+stuGender+"同学");
    }
}
