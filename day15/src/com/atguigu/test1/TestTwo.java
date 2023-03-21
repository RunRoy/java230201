package com.atguigu.test1;

import java.io.UnsupportedEncodingException;

public class TestTwo {
    public static void main(String[] args) {
        // String的常用方法
        String s1 = new String("hello");
        char[] chars = s1.toCharArray();// 将字符串拆成char型数组
        String s2 = new String(chars);// 将char型数组变成String对象
        byte[] bytes = s1.getBytes();// 使用默认的编码规则将字符串拆成byte型数组
        try {
            byte[] bytes1 = s1.getBytes("utf-8");// 使用参数的编码规则将String拆成byte型数组
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        String s3 = new String(bytes);// 使用默认编码规则将一个byte型数组变成String
        try {
            String s4 = new String(bytes,"utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

        String ss = "hello";
        String sss = "Hello";
        System.out.println("hello" + " world");
        System.out.println(ss + sss);
        // ss = ss.concat(sss).intern();// 将参数字符串拼接到调用方法的字符串上
        System.out.println(ss);

        System.out.println(ss.equals(sss));// 考虑大小写的比较两个字符串是否相等
        System.out.println(ss.equalsIgnoreCase(sss));// 忽略大小写的比较两个字符串是否相等
        System.out.println(ss.toUpperCase().equals(sss.toUpperCase()));// 方法的复合调用


    }
}
