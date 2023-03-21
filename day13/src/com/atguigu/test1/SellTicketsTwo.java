package com.atguigu.test1;

public class SellTicketsTwo extends Thread{
    private static int tickets = 100;
    private static Object lock = new Object();

    @Override
    public void run() {
        while(true) {
            // 同步代码块
            // 锁对象必须要求唯一，内存中不能出现两个或者两个以上的锁对象，
            // 至于锁对象属于哪个类无所谓，因为不会调用锁对象的属性或者方法
            synchronized (lock) {
                if (tickets <= 0) {
                    System.out.println("票已售完");
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(this.getName() + "线程卖出一张票，当前剩余票" + (--tickets) + "张~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}
