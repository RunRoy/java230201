package com.atguigu.homework.test3;

import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-19 13:41
 */
public class Wife extends Thread {
    private Account account;

    public Wife(String name, Account account) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        Scanner random = null;
        while (true) {
            account.withdraw(Math.random()*19000+1000);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
