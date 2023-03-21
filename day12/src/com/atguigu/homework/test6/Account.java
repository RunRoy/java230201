package com.atguigu.homework.test6;

/**
 * @author lystart
 * @create 2023-02-17 18:02
 */
public class Account {
    private int account;//账户
    private static double balance;//余额


    public Account() {
    }

    public Account(int account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double money) throws Exception {
        if (money < 0) {
            throw new Exception("越取你余额越多，想得美");

        } else if (money > balance) {
            throw new Exception("取款金额不足，不支持当前取款操作");
        } else {
            System.out.println("取款成功当前余额为" + (balance -= money));
        }
    }

    public void save(double money) throws Exception {
        if (money < 0) {
            throw new Exception("越存余额越少，你愿意吗？");
        }else {
            System.out.println("存款成功余额为 ：" + (balance += money));
        }
    }


}
