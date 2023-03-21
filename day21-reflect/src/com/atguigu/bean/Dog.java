package com.atguigu.bean;

/**
 * 包名:com.atguigu.bean
 *
 * @author Leevi
 * 日期2023-03-01  10:12
 */
public class Dog {
    private String name;
    private String color;
    private int age;
    public Dog() {
    }

    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void say(){
        System.out.println("hello world");
    }

    public void eat(String food){
        System.out.println("吃:"+food);
    }

    public void eat(){
        System.out.println("吃饭");
    }
}
