package com.atguigu.test;

public class Dog extends Pet {
    public Dog(){
        // 子类必须在自己构造方法的第一行调用父类的构造方法
        // 如果子类构造方法中没有显示调用父类构造方法，则默认调用父类无参的构造方法
        super("旺财",3,"土狗");// 使用super()调用父类的构造方法
    }
    @Override
    public void play() {
        System.out.println("玩儿丢飞盘");
    }
}
