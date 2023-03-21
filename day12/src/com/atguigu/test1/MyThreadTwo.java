package com.atguigu.test1;

public class MyThreadTwo implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
