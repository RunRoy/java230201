package com.atguigu.morningtest;

public class Outer {
    private int one;
    private static int two;

    static class Inner{
        private int three;
        private static int four;

        public void methodOne(){
            // System.out.println(one);
            System.out.println(two);
            System.out.println(three);
            System.out.println(four);
        }
    }
}
