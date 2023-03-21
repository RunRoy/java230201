package com.atguigu.test5;

public class TestOne {
    public static void main(String[] args) {
        Integer integer = new Integer(100);
        System.out.println(integer);
        // 装箱与拆箱
        // 装箱：基础类型变成包装类对象
        int one = 50;
        Integer integer1 = new Integer(one);
        Integer integer2 = Integer.valueOf(one);
        // 拆箱：包装类对象变成基础类型
        int two = integer1.intValue();
        // 基础类型和包装类转成String
        // 基础类型或者包装类对象转成String
        String s1 = Integer.toString(two);
        String s2 = integer1.toString();
        String s3 = two + "";
        String s4 = integer1 + "";
        // String转成包装类对象或者基础数据类型
        Integer integer3 = new Integer(s1);
        int three = Integer.parseInt(s1);

        System.out.println("---------------------------------------");
        // 从jdk1.5开始，允许自动装箱与拆箱
        int four = new Integer(100);
        Integer integer4 = 100;
    }
}
