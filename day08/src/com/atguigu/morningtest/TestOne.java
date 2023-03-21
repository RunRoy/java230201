package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        Type type = new Type(1,"智能手机",2);
        Goods goods = new Goods(1,"小米手机",3000,200,type);
        GoodsTools goodsTools = new GoodsTools();
        goodsTools.showGoodsInfo(goods);
    }
}
