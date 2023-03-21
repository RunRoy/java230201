package com.atguigu.homework.test6;

/**
 * @author lystart
 * @create 2023-02-14 18:03
 */
public abstract class Vehicle {

    private int wheels;//轮子的数量

    public Vehicle() {
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public abstract void drive();

    @Override
    public String toString() {
        return "Vehicle{" +
                "轮子的数量=" + wheels +
                '}';
    }
}
