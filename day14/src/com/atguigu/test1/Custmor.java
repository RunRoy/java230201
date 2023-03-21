package com.atguigu.test1;

// 消费者
public class Custmor extends Thread{
    private Store store;
    public Custmor(Store store){
        this.store = store;
    }
    @Override
    public void run() {
        store.get();
    }
}
