package com.atguigu.test1;

public class TestThree {
    public static void main(String[] args) {
        SellTicketsThree sellTicketsThree = new SellTicketsThree();
        Thread thread = new Thread(sellTicketsThree);
        thread.start();

        new Thread(sellTicketsThree).start();
        new Thread(sellTicketsThree).start();
    }
}
