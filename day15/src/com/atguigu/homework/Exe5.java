package com.atguigu.homework;

import com.sun.xml.internal.ws.runtime.config.TubelineFeatureReader;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-21 21:26
 */
public class Exe5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s1 = input.next();
        StringBuffer s = new  StringBuffer(s1);
        String s2 = s.reverse().toString();
        if(s1.equals(s2)){
            System.out.println(s1 + "是回文字符串");
        }else {
            System.out.println(s1 + "不是回文字符串");

        }

//        char[] chars = s1.toCharArray();
//        for (int i = 0; i < chars.length/2; i++) {
//            char temp = chars[i];
//            chars[i] = chars[chars.length-1-i];
//            chars[chars.length-1-i] = temp;
//        }
//        String str = new String(chars);
//        System.out.println(str);
//        System.out.println(s1);
//        System.out.println(Arrays.toString(chars));
//        if(str.equals(s1) == true){
//            System.out.println(s1 + "是回文字符串");
//        }else {
//            System.out.println(s1 + "不是回文字符串");
//        }
    }
}
