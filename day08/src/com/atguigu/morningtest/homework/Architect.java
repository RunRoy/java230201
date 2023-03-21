package com.atguigu.morningtest.homework;

/**
 * @author lystart
 * @create 2023-02-12 0:37
 */
public class Architect extends Designer{

    private double stock;

    public Architect(){

    }
    public Architect(double stock){
        this.stock = stock;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getInfo(){
        return super.say() + "架构师" + "奖金" +super.getBonus() + "股票" + stock;
    }
}
