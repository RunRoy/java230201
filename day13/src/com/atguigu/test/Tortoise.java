package com.atguigu.test;

public class Tortoise extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            // 每循环一次跑一米，每循环一次消耗一秒钟，一秒跑一米
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("乌龟向前跑了一米~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if(i == 30){
                System.out.println("乌龟已经跑到了终点========================");
                break;
            }
            if(i % 10 == 0){
                System.out.println("乌龟进入休眠状态---------------------");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
