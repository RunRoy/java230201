package com.atguigu.test;

// 接口不允许实例化
// 接口中不能出现普通方法和构造方法
public interface Person {
    // 在接口中声明的属性默认是 public static final
    public static final int ONE = 100;

    // 在接口中声明的方法默认是 public abstract
    public abstract void sayHello();

}
