package com.atguigu.test1;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("旺财");
        dog.setAge(3);
        dog.setType("哈士奇");
        dog.play();
        Cat cat = new Cat();
        cat.play();
    }
}
