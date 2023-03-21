package com.atguigu.test;

public class MyThreadOne extends Thread{
    public MyThreadOne(){

    }
    public MyThreadOne(String name){
        super(name);
    }
    // 运行子线程的代码
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+":"+i+"~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
