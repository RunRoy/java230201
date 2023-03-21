package com.atguigu.test;

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
    // 普通成员内部类只能声明普通成员不能声明静态成员
    // 普通成员内部类可以访问外部类的所有成员
    public class Inner1{
        public int one;
//        public static int two;
//
//        public static void methodOne(){
//
//        }
        public void methodOne(){
            System.out.println(one);
            System.out.println(three);
            System.out.println(four);
        }
    }

    public void method(){
        int five = 50;
        // 局部内部类
        // 局部内部类只能声明普通成员，不能声明静态成员
        // 局部内部类能访问所有的属性或者局部变量
        class Inner2{
            public int one;
            // public static int two;

            public void methodOne(){
                System.out.println(one);
                System.out.println(three);
                System.out.println(four);
                System.out.println(five);
            }
        }

        Inner2 inner2 = new Inner2();
        System.out.println(inner2.one);
        inner2.methodOne();
    }

    public void methodOne(){
        System.out.println(Inner.two);
        Inner.methodTwo();
        // 在外部类类体内创建静态成员内部类的对象
        Inner inner = new Inner();
        System.out.println(inner.one);
        inner.methodOne();

        Inner1 inner1 = new Inner1();
        System.out.println(inner1.one);
        inner1.methodOne();
    }
}

