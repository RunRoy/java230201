package com.atguigu.test;

public class TestRun {
    public static void main(String[] args) {
        Tortoise tortoise = new Tortoise();
        Rabbit rabbit = new Rabbit();
        tortoise.start();
        rabbit.start();
    }
}
