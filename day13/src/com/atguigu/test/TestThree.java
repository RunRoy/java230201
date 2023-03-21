package com.atguigu.test;

public class TestThree {
    public static void main(String[] args) {
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);
            try {
                // sleep方法可以让当前线程进入休眠状态
                // 参数是休眠的时长，单位为毫秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
