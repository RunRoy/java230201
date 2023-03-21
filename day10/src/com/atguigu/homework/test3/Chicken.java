package com.atguigu.homework.test3;

/**
 * @author lystart
 * @create 2023-02-14 19:21
 */
public class Chicken extends Bird implements Flyable{
    @Override
    public void eat() {
        System.out.println("鸡吃谷子");
    }

    @Override
    public void fly() {
        System.out.println("鸡上房揭瓦，满院子乱扑腾");
    }
}
