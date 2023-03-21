package com.atguigu.homework.test3;

import java.sql.SQLOutput;
import java.util.Base64;
import java.util.concurrent.BrokenBarrierException;

/**
 * @author lystart
 * @create 2023-02-19 12:28
 */
public class Account {
    private final int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    /**
     * 存钱
     *
     * @param money
     */
    public void save(double money) {
        if (money < 0) {
            System.out.println("输入有误，存入金额为负数");
        } else {
            balance += money;
            System.out.println(Thread.currentThread().getName() + "存款成功当前余额为：" + balance);
        }
    }

    /**
     * 取钱
     *
     * @param money
     */
    public void withdraw(double money) {
        if (money > balance) {
            System.out.println("余额不足要等待");
        } else {
            balance -= money;
            System.out.println(Thread.currentThread().getName() + "取款成功，当前余额为：" + balance);
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }
}
