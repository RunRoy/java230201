package com.atguigu.homework;

import java.util.Arrays;

/**
 * @author lystart
 * @create 2023-02-20 18:31
 */
public class Exe1 {
    /*
    直线上有n个点，数组a[0], a[1], ..., a[n-1]存了每个点相对与后一个点的距离（最后一个点存储值为零），
    有一个长度为L的绳子放在直线上最多能覆盖多少个点?用java程序实现
     */
    public static void main(String[] args) {

        double[] arr = new double[10];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = Math.random() * 100;//[0,100]之间的小数
        }
        arr[arr.length - 1] = 0;
        System.out.println("直线上每一个点距离下一个点的距离" + Arrays.toString(arr));

        double length = 150.5;

        int count = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum <= length) {
                count++;
            } else {
                break;
            }
        }
        System.out.println("长度为：" + length + "的绳子最多能覆盖" + count + "点");
    }
}
