package com.atguigu.test1;

// 在接口声明时声明支持泛型
public interface MyInterOne<T> {
    // 泛型不能使用在静态成员上，只能使用在普通成员上
    // public static final T data;

    public T methodOne();
    public void methodTwo(T t);
    public T methodThree(T t);
}
