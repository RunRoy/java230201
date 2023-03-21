package com.atguigu.jdbc;

/**
 * 包名:com.atguigu.jdbc
 *
 * @author Leevi
 * 日期2023-03-10  14:58
 */
public class Account {
    private Integer accountId;
    private String accountName;
    private Integer money;

    public Account() {
    }

    public Account(Integer accountId, String accountName, Integer money) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", money=" + money +
                '}';
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
