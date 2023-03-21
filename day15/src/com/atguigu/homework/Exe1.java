package com.atguigu.homework;

import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-21 18:01
 */
public class Exe1 {
    public static void main(String[] args) {
//        // 反转键盘录入的字符串
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入字符串：");
//       StringBuilder sbf = new StringBuilder(input.next());
//        System.out.println("反转后" + sbf.reverse());


//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入字符串");
//        String next = input.next();
//        char[] chars = next.toCharArray();
//        for (int l = 0; l < chars.length / 2; l++) {
//            char emp = chars[l];
//            chars[l] = chars[chars.length-1-l];
//            chars[chars.length-1-l] = emp;
//        }
//        for (char aChar : chars) {
//            System.out.print("反转后" + aChar);
//        }

        // 反转数组
        int[] arr = new int[]{6,5,4,3,2,1};
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));


    }
}
