package com.atguigu.test;


public class TestTwo {
    public static void main(String[] args) {
        // 实现Runnable接口
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        MyThreadOne myThreadOne = new MyThreadOne();
        // 开启子线程，调用参数对象的run方法
        Thread thread = new Thread(myThreadOne);
        thread.start();
        Thread thread1 = new Thread(myThreadTwo);
        thread1.start();
        Thread thread2 = new Thread(myThreadTwo);
        thread2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"---------------------------------");
        }
    }
}
