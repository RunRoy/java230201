package com.atguigu.stream;

/**
 * 包名:com.atguigu.stream
 *
 * @author Leevi
 * 日期2023-03-03  14:32
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
