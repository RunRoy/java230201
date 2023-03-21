package com.atguigu.test1;

@SuppressWarnings("unused")
public class TestTwo {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 抑制警告注解，属性就是抑制的警告类型
        @SuppressWarnings("unused")
        int one = 100;
        // System.out.println(one);
        int two = 200;
    }
}
