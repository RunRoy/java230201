package com.atguigu.test1;

public class TestFour {
    public static void main(String[] args) {
        // 正则表达式
        String s1 = "Helloo";
        String s2 = "[A-Z,a-z]{5,}";

        boolean flag = s1.matches(s2);
        System.out.println(flag);
    }
}
