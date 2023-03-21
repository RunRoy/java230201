package com.atguigu.test2;

public class Dog extends Animal{
    public void methodOne(){
        run();
        setName("Tom");
        System.out.println(getName());
        // System.out.println(this.name);
    }
}
