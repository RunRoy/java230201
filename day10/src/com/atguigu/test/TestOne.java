package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        // 当接口需要运行时，必须创建该接口的实现类对象，由实现类对象运行对应方法
        Person p = new Teacher();
        p.sayHello();
        Person[] ps = new Person[5];
        ps[0] = new Teacher();
        methodOne(new Teacher());
        methodOne(new Student());
    }

    public static void methodOne(Person p){
        p.sayHello();
    }
}
