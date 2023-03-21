package com.atguigu.test2;

public class TestTwo {
    public static void main(String[] args) {
        // 在多态状态下，我们只能调用父类中定义的方法
        // 多态状态下，子类独有的方法是无法调用的
        // 可以调用哪些方法是要看引用类型的，方法运行时体现的是对象类型的特点
        Pet pet = new Dog();// 向上转型(自动完成)
        pet.play();
        // 如果想调用一个方法，则必须拥有一个定义了该方法的引用
        // instanceof关键字的左侧一定是一个对象，右侧一定是一个类
        // 如果左侧这个对象是右侧这类的对象(左侧这个对象是右侧这类的子类对象)，则返回true，否则返回false
        if(pet instanceof Dog) {
            Dog dog = (Dog) pet;// 向下转型(手动完成)
            dog.work();
        }
        if(pet instanceof Cat) {
            Cat cat = (Cat) pet;
            cat.play();
        }
    }
}
