package com.atguigu.morningtest.homework.Exe2;

/**
 * @author lystart
 * @create 2023-02-13 18:07
 */
public class Person {
    private String name;
    private int age;
    private String career;

    public Person() {
    }

    /**
     * 吃饭
     */
    public void eat(){
        System.out.println(name + "吃饭");
    }

    public void  toilet(){
        System.out.println(name + "上洗手间");
    }


    public String getInfo() {
        return "Person{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                ", 职业='" + career + '\'' +
                '}';
    }

    public Person(String name, int age, String career) {
        this.name = name;
        this.age = age;
        this.career = career;
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

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
