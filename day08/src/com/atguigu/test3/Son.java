package com.atguigu.test3;

public class Son extends Father {
    public int x = 2;

    public int methodOne(){
        System.out.println(super.x);// 父类对象
        System.out.println(this.x);// 本类对象
        return super.x;
    }
}
