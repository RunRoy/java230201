package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        // String的方法
        String s = "hello";
        String s1 = new String("hello");
        char[] chars = s1.toCharArray();// 将String拆成char型的数组
        String s2 = new String(chars);
        byte[] bytes = s1.getBytes();// 将String拆成byte型的数组
        String s3 = new String(bytes);

        System.out.println(s.toUpperCase());// 全转大写
        System.out.println(s.toLowerCase());// 全转小写
        System.out.println(s.length());// 返回包含两端和中间空格数的字符数
        System.out.println(s.trim());// 去掉两端的空格
        char c = s.charAt(0);// 返回参数索引位置的字符
        int index = s.indexOf("h");// 返回参数字符串第一次出现的索引
        int index1 = s.indexOf('h');// 返回参数字符第一次出现的索引
        int index2 = s.indexOf("h",index+1);// 从第二个参数索引位置开始查找第一次出现第一个参数字符串的索引位置
        int index3 = s.indexOf('h',index1+1);// 从第二个参数索引位置开始查找第一次出现第一个参数字符的索引位置
        int index4 = s.lastIndexOf("h");// 返回参数字符串最后一次出现的索引
        int index5 = s.lastIndexOf('h');// 返回参数字符最后一次出现的索引
        int index6 = s.lastIndexOf("h",index4-1);// 从第二个参数索引位置开始查找最后一次出现第一个参数字符串的索引位置
        int index7 = s.lastIndexOf('h',index5-1);// 从第二个参数索引位置开始查找最后一次出现第一个参数字符的索引位置
        boolean flag = s.contains("h");// 判断调用方法的字符串中是否包含参数字符串
        boolean flag1 = s.equals("hello");// 考虑大小写的判断两个字符串是否相等
        boolean flag2 = s.equalsIgnoreCase("hello");// 忽略大小写的判断两个字符串是否相等
        String sub1 = s.substring(3);// 从参数索引位置开始截取到字符串末尾
        String sub2 = s.substring(1,4);// 从第一个参数索引位置开始截取到第二个参数索引位置的前一位
        String s4 = s.replace('h','x');// 在原串中用第二个参数字符替换所有的第一个参数字符
        String s5 = s.replaceAll("h","x");// 在原串中用第二个参数字符串替换所有的第一个参数字符串
        String s6 = s.replaceFirst("h","x");// 在原串中用第二个参数字符串替换第一次出现第一个参数字符串
        String[] ss = s.split("-");// 使用参数字符串将原串拆分成字符串数组
        boolean flag3 = s.matches("h");// 判断调用方法的字符串是否符合参数匹配规则
    }
}
