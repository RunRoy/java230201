package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) {
        // 继承Thread类
        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.start();// 开启子线程，调用run方法
        // 一个线程对象只能开启一个子线程，一个线程对象只能start()一次
        MyThreadOne myThreadOne1 = new MyThreadOne();
        myThreadOne1.start();
        MyThreadOne myThreadOne2 = new MyThreadOne();
        myThreadOne2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"-------------------------------");
        }
    }
}
