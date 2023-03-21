package com.atguigu.test1;


public class TestTwo {
    public static void main(String[] args) {
        // 实现Runnable接口
        MyThreadTwo myThreadTwo = new MyThreadTwo();
        // 开启子线程，调用参数对象的run方法
        Thread thread = new Thread(myThreadTwo);
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
