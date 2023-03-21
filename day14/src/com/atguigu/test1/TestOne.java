package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) {
        Store store = new Store();
        Produtor produtor = new Produtor(store);
        Produtor produtor1 = new Produtor(store);
        Produtor produtor2 = new Produtor(store);
        Custmor custmor = new Custmor(store);
        Custmor custmor1 = new Custmor(store);
        Custmor custmor2 = new Custmor(store);
        produtor.start();
        produtor1.start();
        produtor2.start();
        custmor.start();
        custmor1.start();
        custmor2.start();
    }
}
