package com.atguigu.test;

public class MyThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
