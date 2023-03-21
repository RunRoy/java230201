package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        // Thread类的常用方法
        Thread thread = new Thread();
        Thread thread1 = new Thread("子线程1");
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {

            }
        },"子线程2");

        thread.run();// 开启子线程后，运行的方法
        thread.start();// 开启子线程，运行run方法。一个线程对象只能开启一个子线程
        thread.setName("子线程3");// 设置子线程名
        System.out.println(thread.getName());// 获取子线程名
        thread.setPriority(1);// 设置线程的优先级，从1-10，从低到高。默认的线程优先级是5
        System.out.println(thread.getPriority());// 获取线程优先级
        thread.setDaemon(true);// 设置线程对象为当前线程的守护线程
        System.out.println(thread.isAlive());// 判断当前线程是否处于激活状态
        try {
            thread.join();// 让线程对象插队，方法如果有参数，参数是等待的毫秒数，如果没有参数则需要插队线程完成其他线程才能执行
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(1000);// 当前线程进入休眠，参数为休眠时长
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread thread4 = Thread.currentThread();// 返回当前形成对象
    }
}
