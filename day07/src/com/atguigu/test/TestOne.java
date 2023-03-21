package com.atguigu.test;

public class TestOne {
    public static void main(String[] args) {
        // 方法传参是的内存分析
//        int one = 101;
//        int two = 202;
//        System.out.println("one = "+one+", two = "+two);
//        methodOne(one,two);
//        System.out.println("one = "+one+", two = "+two);
        MyData myData = new MyData();
        myData.a = 100;
        myData.b = 200;
        System.out.println("in main myData.a = "+myData.a+",myData.b = "+myData.b);
        methodTwo(myData);
        System.out.println("in main myData.a = "+myData.a+",myData.b = "+myData.b);
    }

    public static void methodOne(int a,int b){
        System.out.println("a="+a+",b="+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a="+a+",b="+b);
    }

    public static void methodTwo(MyData myData){
        System.out.println("myData.a = "+myData.a+",myData.b = "+myData.b);
        int temp = myData.a;
        myData.a = myData.b;
        myData.b = temp;
        System.out.println("myData.a = "+myData.a+",myData.b = "+myData.b);
    }
}

class MyData{
    public int a;
    public int b;
}
