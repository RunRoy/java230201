package com.atguigu.test.test4;

public class Pet {
    private String name;
    private int age;
    private String type;

    public Pet() {
    }

    public Pet(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pet play(){
        System.out.println("和主人玩儿");
        return null;
    }
}
