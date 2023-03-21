package com.atguigu.morningtest;

public class Goods {
    public int goodsId;
    public String goodsName;
    public double goodsPrice;
    public int goodsNum;
    public Type goodsType;

    public Goods() {
    }

    public Goods(int goodsId, String goodsName, double goodsPrice, int goodsNum, Type goodsType) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsPrice = goodsPrice;
        this.goodsNum = goodsNum;
        this.goodsType = goodsType;
    }

    public String getInfo(){
        return "编号："+goodsId+"，品名："+goodsName
                +"，单价："+goodsPrice+"，库存："+goodsNum+"，分类："+goodsType.getInfo();
    }
}
