package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        // 继承Thread类
        MyThreadOne myThreadOne = new MyThreadOne();
        myThreadOne.setName("子线程1");// 设置线程名
        MyThreadOne myThreadOne1 = new MyThreadOne("子线程2");
        MyThreadOne myThreadOne2 = new MyThreadOne("子线程3");

        myThreadOne.setPriority(Thread.MAX_PRIORITY);// 设置线程优先级，线程优先级从低到高从1-10.
        myThreadOne1.setPriority(1);
        myThreadOne2.setPriority(6);

        System.out.println(myThreadOne.getName()+"线程的优先级是："+myThreadOne.getPriority());
        System.out.println(myThreadOne1.getName()+"线程的优先级是："+myThreadOne1.getPriority());
        System.out.println(myThreadOne2.getName()+"线程的优先级是："+myThreadOne2.getPriority());

        Thread mainThread = Thread.currentThread();// 返回当前代码正在运行时的线程对象
        mainThread.setName("主线程");
        System.out.println(mainThread.getName() + "线程的优先级是" + mainThread.getPriority());

        myThreadOne.start();// 开启子线程，调用run方法
        // 一个线程对象只能开启一个子线程，一个线程对象只能start()一次
        myThreadOne1.start();
        myThreadOne2.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(mainThread.getName()+":"+i+"-------------------------------");
        }
    }
}
