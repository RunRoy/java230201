package com.atguigu.test1;

public class MyThreadOne extends Thread{
    // 运行子线程的代码
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
