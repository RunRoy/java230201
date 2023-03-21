package com.atguigu.test5;

public class Outer {
    private int three;
    private static int four;
    // 内部类就是声明在另一个类的类体中的类
    // 静态成员内部类
    // 静态成员内部类可以声明普通成员，也可以声明静态成员
    // 静态成员内部类只能访问外部类的静态成员不能访问外部类的普通成员
    public static class Inner{
        public int one;
        public static int two;

        public void methodOne(){
            System.out.println(one);
            System.out.println(two);
            // System.out.println(three);
            System.out.println(four);
        }

        public static void methodTwo(){
            // System.out.println(one);
            System.out.println(two);
            // System.out.println(three);
            System.out.println(four);
        }
    }
    // 普通成员内部类
    public class Inner1{

    }

    public void method(){
        // 局部内部类
        class Inner2{

        }
    }

    public void methodOne(){
        System.out.println(Inner.two);
        Inner.methodTwo();
        // 在外部类类体内创建静态成员内部类的对象
        Inner inner = new Inner();
        System.out.println(inner.one);
        inner.methodOne();
    }
}

