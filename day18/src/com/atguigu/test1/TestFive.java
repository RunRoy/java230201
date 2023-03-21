package com.atguigu.test1;

import java.util.ArrayList;
import java.util.Collection;

public class TestFive {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList();
        col.add("Tom");
        col.add("Jerry");
        col.add("Mary");
        Collection<Integer> col1 = new ArrayList<>();
        Collection<Animal> col2 = new ArrayList<>();
        Collection<Cat> col3 = new ArrayList<>();
        Collection<Dog> col4 = new ArrayList<>();

        methodOne(col);
        // methodTwo(col1);
        methodThree(col);
        methodThree(col1);
        methodFour(col4);
        methodFive(col2);

    }

    public static void methodOne(Collection col){
        for (Object o : col) {
            System.out.println(o);
        }
    }

    public static void methodTwo(Collection<String> col){
        for (String s : col) {
            System.out.println(s);
        }
    }

    // 通配的泛型
    public static void methodThree(Collection<?> col){
        for (Object o : col) {
            System.out.println(o);
        }
    }

    // ？通配的泛型必须是Animal或者是Animal的子类，这种情况叫做指定泛型的上限
    public static void methodFour(Collection<? extends Animal> col){
        for (Animal animal : col) {
            System.out.println(col);
        }
    }

    // ？通配的类型必须是Dog或者是Dog的父类，指定泛型的下限
    public static void methodFive(Collection<? super Dog> col){
        for (Object o : col) {
            System.out.println(o);
        }
    }
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
