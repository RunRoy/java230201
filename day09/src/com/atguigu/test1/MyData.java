package com.atguigu.test1;

public class MyData {
    public final int ONE = 100;

//    public MyData(){
//        ONE = 100;
//    }
//
//    public MyData(int num){
//        ONE = num;
//    }

    public void methodOne(){
        final int num;
        num = 100;
        System.out.println(num);
    }

    // final修饰形参，形参在方法内部只能使用，不能被重新赋值
    public void methodTwo(final int num){

    }
}
