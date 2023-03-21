package com.atguigu.test4;

public class TestOne {
    public static void main(String[] args) {
        // Enum类的常用方法
        Season season = Season.AUTUMN;
        System.out.println(season);

        System.out.println(season.name());
        System.out.println(season.ordinal());

        Season[] seasons = Season.values();// 返回当前枚举类所有的属性数组
        System.out.println(seasons.length);
        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }

        Season season1 = Season.valueOf("SPRING");// 根据属性名获取单个的枚举对象
        System.out.println(season1);
    }
}
