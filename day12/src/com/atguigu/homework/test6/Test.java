package com.atguigu.homework.test6;

/**
 * @author lystart
 * @create 2023-02-17 18:28
 */
public class Test {
    public static void main(String[] args){
        Account account = new Account(1001,3000);

        try {
            account.withdraw(700);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            account.save(-1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
