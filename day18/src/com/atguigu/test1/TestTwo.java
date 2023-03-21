package com.atguigu.test1;

public class TestTwo {
    public static void main(String[] args) {
        MySubData<String> mySubData = new MySubData<>();
        mySubData.setData("Tom");
        Object o = mySubData.getData();
    }
}
