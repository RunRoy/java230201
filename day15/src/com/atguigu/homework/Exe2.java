package com.atguigu.homework;

import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-21 19:01
 */
public class Exe2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入qq号码");
        String s1 = input.next();
        String s2 = "[1-9]{5,12}";
        System.out.println("这个qq号码是否正确" + s1.matches(s2));

    }
}
