package com.atguigu.morningtest;

public class TestOuter {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.methodOne();
    }
}
