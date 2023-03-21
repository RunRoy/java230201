package com.atguigu.test1;

// 子类继承支持泛型的父类时子类不支持泛型且父类也没有给出泛型的具体类型此时泛型视作Object
// public class MySubData extends MyData{
// 子类继承支持泛型的父类时父类确定了泛型的具体类型子类不支持泛型
// public class MySubData extends MyData<String>{
// 子类继承支持泛型的父类时，子类也支持泛型，且继承到了父类的泛型
public class MySubData<T> extends MyData<T>{
    @Override
    public T getData() {
        return super.getData();
    }

    @Override
    public void setData(T data) {
        super.setData(data);
    }
    //    @Override
//    public String getData() {
//        return super.getData();
//    }
//
//    @Override
//    public void setData(String data) {
//        super.setData(data);
//    }
}
