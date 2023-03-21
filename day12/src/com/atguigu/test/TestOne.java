package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        String s = null;
        // 非受检异常：非受检异常不会报编译错误，只会在运行时抛出异常
        // 非受检异常没有编译错误，可以不强制必须处理异常
        s.toString();

        // 受检异常：受检异常报编译期错误，如果受检异常不处理，则不能通过编译
        // 受检异常是强制必须处理的
        // Class.forName("");
    }
}
