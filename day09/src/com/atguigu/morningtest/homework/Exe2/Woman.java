package com.atguigu.morningtest.homework.Exe2;

/**
 * @author lystart
 * @create 2023-02-13 18:14
 */
public class Woman extends Person{
    @Override
    public void eat() {
        System.out.println(getName() + "细嚼慢咽");
    }

    public void makeup(){
        System.out.println(getName() + "化妆");
    }
}
