package com.atguigu.test;

import java.util.ArrayList;
import java.util.Collection;

public class TestOne {
    public static void main(String[] args) {
        // 集合是变长结构
        // Collection接口的特点：单元素集合，一个元素是一个对象，有时候允许元素重复
        // 有时候不允许元素重复，有些有序，有些无序。
        // Collection的常用方法
        Collection col = new ArrayList();
        Collection colOne = new ArrayList();
        colOne.add("小明");
        colOne.add("小强");
        colOne.add("June");
        System.out.println(col.size());
        col.add("Tom");// 将元素添加进集合
        col.add("Jerry");
        col.add("Mary");
        col.add("June");
        col.add("June");
        col.add("June");
        col.add("小明");
        col.add("小强");
        System.out.println(col.size());// 当前集合中的元素数
        System.out.println(col);
        // col.addAll(colOne);// 一次向集合中添加参数集合的所有元素
        System.out.println(col);
        col.remove("June");// 将集合中的元素移除，如果集合中有重复的该元素，则只会移除第一个
        System.out.println(col);
        // col.removeAll(colOne);// 将参数集合中的所有元素从原集合中移除，如果集合中有重复元素则会将所有重复元素移除
        System.out.println(col);
        // col.clear();// 清空集合
        System.out.println(col.isEmpty());// 判断集合是否为空
        System.out.println(col.contains("June"));// 判断集合中是否存在该元素
        col.remove("小明");
        System.out.println(col.containsAll(colOne));// 判断集合中是否包含参数集合的所有元素
    }
}
