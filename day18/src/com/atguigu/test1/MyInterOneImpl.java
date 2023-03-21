package com.atguigu.test1;

// 实现类不支持泛型，实现接口时接口也没给出泛型具体类型，此时泛型视作Object
// public class MyInterOneImpl implements MyInterOne{
// 实现类不支持泛型，实现接口时接口给出泛型具体类型，此时泛型为固定的具体类型
// public class MyInterOneImpl implements MyInterOne<String>{
// 实现类支持泛型，实现类继承了接口的泛型
public class MyInterOneImpl<T> implements MyInterOne<T>{
    @Override
    public T methodOne() {
        return null;
    }

    @Override
    public void methodTwo(T t) {

    }

    @Override
    public T methodThree(T t) {
        return null;
    }
    //    @Override
//    public String methodOne() {
//        return null;
//    }
//
//    @Override
//    public void methodTwo(String s) {
//
//    }
//
//    @Override
//    public String methodThree(String s) {
//        return null;
//    }
    //    @Override
//    public Object methodOne() {
//        return null;
//    }
//
//    @Override
//    public void methodTwo(Object o) {
//
//    }
//
//    @Override
//    public Object methodThree(Object o) {
//        return null;
//    }
}
