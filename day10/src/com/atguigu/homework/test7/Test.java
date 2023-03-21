package com.atguigu.homework.test7;

/**
 * @author lystart
 * @create 2023-02-14 18:32
 */
public class Test {
    public static void main(String[] args) {
        // 获取Payment的所有对象
//        Payment[] payments = Payment.values();
        // 对每个枚举对象调用pay方法
//        for (int i = 0; i < payments.length; i++) {
//            System.out.print(payments[i]);
//            payments[i].pay();
//        }
            Payment.Altray.pay();
            Payment.WECHST.pay();
            Payment.CREDITCSRD.pay();
            Payment.DEPODITCARD.pay();
    }
}
