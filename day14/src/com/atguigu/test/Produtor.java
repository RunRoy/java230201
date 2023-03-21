package com.atguigu.test;

// 生产者
public class Produtor extends Thread{
    private Store store;
    public Produtor(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        store.add();
    }
}
