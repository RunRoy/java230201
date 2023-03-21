package com.atguigu.morningtest;

public class TestTickets {
    public static void main(String[] args) {
        SellTickets sellTickets = new SellTickets();
        Thread thread = new Thread(sellTickets);
        thread.start();
        new Thread(sellTickets).start();
        new Thread(sellTickets).start();
    }
}
