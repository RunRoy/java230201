package com.atguigu.homework.test3;

/**
 * @author lystart
 * @create 2023-02-19 14:32
 */
public class Test {
    public static void main(String[] args) {
        Account account = new Account(1001,0);
        Husband husband = new Husband("老王",account);
        Wife wife = new Wife("韩金龙",account);
        husband.start();
        wife.start();
    }
}
