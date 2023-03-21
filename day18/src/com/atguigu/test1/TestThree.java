package com.atguigu.test1;

public class TestThree {
    public static void main(String[] args) {
        MyInterOne<String> myInterOne = new MyInterOneImpl<>();
        String s = myInterOne.methodOne();
        myInterOne.methodThree("");
        String s1 = myInterOne.methodThree("");

    }
}
