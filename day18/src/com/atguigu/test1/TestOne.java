package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) {
//        MyData myData = new MyData();
//        myData.setData("Tom");
//        System.out.println(myData.getData());
//        MyData myData1 = new MyData();
//        myData1.setData(new Integer(100));
//        System.out.println(myData1.getData());

        // 一个支持泛型的类，在创建对象时没有确定泛型的具体类型，则泛型被当做Object
        MyData myData = new MyData();
        myData.setData("Tom");
        Object o = myData.getData();

        // 一个支持泛型的类在创建对象时给出泛型的具体类型
        MyData<String> myData1 = new MyData<String>();
        myData1.setData("Tom");
        String s = myData1.getData();

        MyData<String> myData2 = new MyData();// 不推荐
        myData2.setData("Jerry");
        String s1 = myData2.getData();

        // 泛型要求引用泛型和对象泛型必须一致，泛型不支持多态
        MyData<String> myData3 = new MyData<>();// 推荐
        myData3.setData("Mary");
        String s2 = myData3.getData();
    }
}
