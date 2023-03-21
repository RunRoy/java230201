package com.atguigu.homework.test3;

import java.util.Scanner;


/**
 * @author lystart
 * @create 2023-02-19 13:22
 */
public class Husband extends Thread {
    private Account account; //= new Account(1001,29990);

    public Husband(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        Scanner random = null;
        while (true) {
            account.save(Math.random()*19000+1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
