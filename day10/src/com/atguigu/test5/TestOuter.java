package com.atguigu.test5;

public class TestOuter {
    public static void main(String[] args) {
        System.out.println(Outer.Inner.two);
        Outer.Inner.methodTwo();
        // 在外部类类体外必须使用外部类类名.内部类类名的方式访问成员内部类
        // 在外部类类体外创建静态成员内部类的对象
        // 静态成员内部类在外部类类体外可以直接创建对象，无需先创建外部类对象
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.one);
        inner.methodOne();
    }
}
