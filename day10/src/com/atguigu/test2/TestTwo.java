package com.atguigu.test2;

public class TestTwo {
    public static void main(String[] args) {
        MyInterOne myInterOne = new MyInterOneImpl();
        myInterOne.methodOne();
        MyInterOne.methodThree();
        // myInterOne.methodThree();
    }
}
