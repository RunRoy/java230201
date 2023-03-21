package com.atguigu.homework.test7;

/**
 * @author lystart
 * @create 2023-02-17 18:48
 */
public class Person {

    private String name;
    private double lifeValue;

    public Person() {
    }

    public Person(String name, double lifeValue) {
        this.name = name;
        setLifeValue(lifeValue);
    }

    public Person(double lifeValue) {
        this.lifeValue = lifeValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(double lifeValue) {
//        if (lifeValue < 0) {
//            throw new NoLifeValueException("生命值不能为负数");
//        } else {
            this.lifeValue = lifeValue;
//        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
