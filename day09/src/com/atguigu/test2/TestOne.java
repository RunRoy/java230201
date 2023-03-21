package com.atguigu.test2;

public class TestOne {
    public static void main(String[] args) {
        Master master = new Master();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        // 传参多态
        master.playWithPet(new Dog());

        System.out.println("----------------------------------");

        // 多态：任何一个需要父类引用的位置都可以传递一个子类对象
        // 实现多态的三个关键步骤：
        // 1、必须有继承有父子类
        // 2、必须是父类编写方法，子类重写方法
        // 3、必须是父类的引用指向子类对象
        Pet p = new Pet();// 本态
        // 创建对象多态
        Pet pet = new Dog();// 多态
        pet.play();
    }
}
