package com.atguigu.stream;

import java.util.Optional;

/**
 * 包名:com.atguigu.stream
 *
 * @author Leevi
 * 日期2023-03-03  14:16
 */
public class Hero {
    private String name;
    private String country;
    private String sex;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Hero() {
    }

    public Hero(String name, String country, String sex) {
        this.name = name;
        this.country = country;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
