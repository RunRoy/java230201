package com.atguigu.morningtest.homework.Exe2;

/**
 * @author lystart
 * @create 2023-02-13 18:12
 */
public class Man extends Person{

    @Override
    public void eat() {
        System.out.println(getName() + "狼吞虎咽");
    }

    public void smoke(){
        System.out.println(getName() + "抽烟");
    }

}
