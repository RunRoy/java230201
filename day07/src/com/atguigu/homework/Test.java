package com.atguigu.homework;

import java.util.Arrays;

/**
 * @author lystart
 * @create 2023-02-10 19:55
 */
public class Test {
    public static void main(String[] args) {
        MathTools mt = new MathTools();
        boolean pv = mt.isPositive(1, 2, 3, 4, 5);
        System.out.println(mt.isEven(1,2,3,4,5));
        System.out.println(pv);
        int[] arr = mt.toArray(1,2,3,4,5);
        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


    }
}
