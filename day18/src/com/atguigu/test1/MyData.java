package com.atguigu.test1;

// 在类的声明位置声明类支持泛型，泛型可以在类体中任何一个类型的位置担任类型
public class MyData<T> {

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //    private Object data;
//
//    public Object getData() {
//        return data;
//    }
//
//    public void setData(Object data) {
//        this.data = data;
//    }
    //    private String data;
//
//    public String getData() {
//        return data;
//    }
//
//    public void setData(String data) {
//        this.data = data;
//    }
}
