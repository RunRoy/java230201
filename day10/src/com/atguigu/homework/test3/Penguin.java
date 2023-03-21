package com.atguigu.homework.test3;

/**
 * @author lystart
 * @create 2023-02-14 19:06
 */
public class Penguin extends Bird implements Swimming{
    @Override
    public void eat() {
        System.out.println("企鹅吃南极磷虾");
    }

    @Override
    public void swim() {
        System.out.println("企鹅下海捉虾");
    }
}
