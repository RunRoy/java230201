package com.atguigu.test1;

public class SellTicketsThree implements Runnable{
    private int tickets = 100;
    private Object lock = new Object();
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock){
                if(tickets <= 0){
                    System.out.println("票已售完");
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"线程卖出一张票，当前剩余票"+(--tickets)+"张~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}
