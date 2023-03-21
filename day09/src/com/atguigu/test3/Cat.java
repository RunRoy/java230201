package com.atguigu.test3;

// 一个普通子类继承自抽象父类时必须重写抽象父类的所有抽象方法
public class Cat extends Pet {
    private String color;

    public Cat() {
    }

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Cat(String name, int age, String gender, String color) {
        super(name, age, gender);
        this.color = color;
    }

    @Override
    public void play() {
        System.out.println("玩儿毛线球");
    }
}
