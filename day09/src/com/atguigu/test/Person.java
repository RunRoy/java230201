package com.atguigu.test;

// 继承状态下，先父类再子类，先静态再普通，先代码块再构造方法
public class Person extends Object{
    private int one;
    public static int two;

    static {
        System.out.println("in Person static block");
    }

    {
        System.out.println("in Person block");
    }

    public Person(){
        System.out.println("in Person()");
    }
}
