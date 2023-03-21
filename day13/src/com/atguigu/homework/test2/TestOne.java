package com.atguigu.homework.test2;

/**
 * @author lystart
 * @create 2023-02-19 0:36
 */
public class TestOne {
    public static void main(String[] args) {
        Number number = new Number();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    number.printOddNum();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }.start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    number.printEvenNum();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
}
