package com.atguigu.morningtest.homework.Exe3;

/**
 * @author lystart
 * @create 2023-02-13 18:41
 */
public class Architect extends Designer{

    private double stock;//股票


    public Architect(){

    }

    public Architect(double stock) {
        this.stock = stock;
    }

    public Architect(double bonus, double stock) {
        super(bonus);
        this.stock = stock;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }


    public Architect(int id, String name, int age, double salary, double bonus, double stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + "架构师" + getBonus() +"股票"+ getStock();
    }
}

