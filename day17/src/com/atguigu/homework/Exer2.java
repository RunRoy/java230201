package com.atguigu.homework;

import java.sql.SQLOutput;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lystart
 * @create 2023-02-24 20:36
 */
public class Exer2 {
    public static void main(String[] args) {
        System.out.println("请输入字符串");
        String input = new Scanner(System.in).next();
//        String str = "aaaaabbbbbcccccdddddeeeeeefffffffgggggggg";
        char[] chars = input.toCharArray();

        Set set = new LinkedHashSet();

        for (int i = 0; i < chars.length; i++) {
            set.add("" + chars[i]);
        }


        System.out.print("去重后：");
        for (Object o : set) {
           String s = (String) o;
            System.out.print(s);
        }

    }
}
