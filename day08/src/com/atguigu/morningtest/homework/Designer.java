package com.atguigu.morningtest.homework;

/**
 * @author lystart
 * @create 2023-02-12 0:31
 */
public class Designer extends Programmer{

    private int bonus;

    public Designer() {
    }

    public Designer(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public String getInfo(){
        return super.say() + "设计师" + "奖金" + bonus;
    }

}
