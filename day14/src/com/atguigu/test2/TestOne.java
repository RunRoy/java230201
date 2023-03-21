package com.atguigu.test2;

public class TestOne {
    public static void main(String[] args) {
        // Math类的常用方法
        System.out.println(Math.abs(10));// 取绝对值
        System.out.println(Math.abs(-10));

        System.out.println(Math.ceil(5.1));// 向上取整
        System.out.println(Math.ceil(5.9));

        System.out.println(Math.floor(5.1));// 向下取整
        System.out.println(Math.floor(5.9));

        System.out.println(Math.round(5.1));// 四舍五入
        System.out.println(Math.round(5.9));

        System.out.println(Math.max(5, 10));// 返回大的数
        System.out.println(Math.min(5, 10));// 返回小的数

        System.out.println("-------------------------------------------");
        int[] nums = new int[16];
        for (int i = 0; i < 10; i++) {
            double d = Math.random();
            int num = (int)(d*nums.length);
            System.out.println(num);
        }
    }
}
