package com.atguigu.morningtest.homework;

/**
 * @author lystart
 * @create 2023-02-11 19:00
 */
public class Person {
    private String name;
    private int age;
    private String occupation;

    public void eat(){
        System.out.println(name + "吃饭");
    }

    public void toilet(){
        System.out.println(name + "上洗手间");
    }
    public String getInfo(){
        return "姓名" + name + "年龄" + age + "职业信息" + occupation;
    }

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    public Person() {
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
