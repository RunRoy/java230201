package com.atguigu.test3;

// abstract是抽象关键字，可以修饰类，可以修饰方法
// abstract修饰类类变成抽象类，抽象类不允许实例化
// abstract修饰方法方法变成抽象方法，抽象方法没有方法体
// 抽象方法必须在抽象类中，抽象类中不一定都是抽象的方法，也有普通方法
public abstract class Pet {
    private String name;
    private int age;
    private String gender;

    public Pet() {
    }

    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void play();
}
