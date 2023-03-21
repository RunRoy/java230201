package com.atguigu.morningtest.homework.Exe3;

/**
 * @author lystart
 * @create 2023-02-13 18:22
 */
public class Programmer extends Employee{
    public Programmer() {
    }



    @Override
    public String getInfo() {
        return "程序员" + super.getInfo();
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);



    }
}
