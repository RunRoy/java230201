package com.atguigu.test;

// Teacher implements Person Teacher类实现了接口Person，Teacher是Person接口的实现类
// 实现类必须实现接口中的所有抽象方法
public class Teacher implements Person{
    @Override
    public void sayHello() {
        System.out.println("你好，我是一名老师");
    }
}
