package com.atguigu.test2;

public class MyInterOneImpl implements MyInterOne{
    @Override
    public void methodTwo() {
        System.out.println("in MyInterOneImpl methodTwo()");
    }

    @Override
    public void methodOne() {
        System.out.println("in MyInterOneImpl methodOne()");
    }
}
