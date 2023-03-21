package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        Store store = new Store();
        Produtor produtor = new Produtor(store);
        Custmor custmor = new Custmor(store);
        produtor.start();
        custmor.start();
    }
}
