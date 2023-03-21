package com.atguigu.test;

public class Animal {
    public String name;
    public int age;

    public Animal() {
    }

    public Animal(String name) {
        this();
        this.name = name;
    }

    public Animal(String name, int age) {
        // this();// 必须在构造方法的第一行调用其他的构造方法
        this(name);
        this.name = name;
        this.age = age;
    }
}
