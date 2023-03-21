package com.atguigu.morningtest;

public class TestTwo {
    public static void main(String[] args) {
        // StringBuilder和StringBuffer
        String s = "hello";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.append(" ").append(" world").append("\n");
        stringBuilder.append("one ").append("world").append("one dream");
        s = stringBuilder.toString();
    }
}
