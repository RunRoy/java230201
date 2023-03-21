package com.atguigu.morningtest;

public class SellTickets implements Runnable{
    private int tickets = 100;
    @Override
    public void run() {
        while(true){
            synchronized (this){
                if(tickets <= 0){
                    System.out.println("票已售完");
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"线程卖出一张票，当前剩余票"+(--tickets)+"张~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }
}
