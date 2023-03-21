package com.atguigu.morningtest.homework.Exe3;

/**
 * @author lystart
 * @create 2023-02-13 18:30
 */
public class Designer extends Programmer{

   private double bonus;//奖金

   public Designer(){

   }

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public String getInfo() {
        return super.getInfo()+ "设计师" + "奖金" +  bonus;
    }
}
