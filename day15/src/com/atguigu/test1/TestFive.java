package com.atguigu.test1;

public class TestFive {
    public static void main(String[] args) {
        String word = "Hello";
        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.append(" ").append("World");
        stringBuilder.append("\n").append("One").append(" World").append(" ");
        stringBuilder.append("One").append(" Dream");
        word = stringBuilder.toString();
        System.out.println(word);
    }
}
