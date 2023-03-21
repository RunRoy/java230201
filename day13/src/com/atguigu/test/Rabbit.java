package com.atguigu.test;

public class Rabbit extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            // 每循环一次跑一米，每循环一次消耗0.1秒钟，一秒跑十米
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("兔子向前跑了一米~~~~~~~~~~~~~~~~~~~~~~~~~~");
            if(i == 30){
                System.out.println("兔子已经跑到了终点========================");
                break;
            }
            if(i % 10 == 0){
                System.out.println("兔子进入休眠状态---------------------");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
