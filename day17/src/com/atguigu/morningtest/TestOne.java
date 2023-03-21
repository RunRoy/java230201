package com.atguigu.morningtest;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestOne {
    public static void main(String[] args) {
        // Collection的常用方法
        Collection col = new ArrayList();
        Collection col1 = new ArrayList();

        col.add("Tom");// 将元素添加进集合
        col.add("Jerry");
        col.add("Mary");

        col.addAll(col1);// 一次将参数集合中的所有元素添加进当前集合

        col.remove("Tom");// 从集合中移除第一次出现的参数元素
        col.removeAll(col1);// 从集合中移除参数集合中所有出现的元素

        System.out.println(col.size());// 当前集合中的元素数

        System.out.println(col.isEmpty());// 判断集合是否为空

        System.out.println(col.contains("Tom"));// 判断集合中是否存在该元素

        System.out.println(col.containsAll(col1));// 判断参数集合中的所有元素是否出现在原集合中

        // col.clear();// 清空集合

        Iterator iterator = col.iterator();// 获取迭代器
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }

        for (Object o : col) {
            System.out.println(o);
        }
    }
}
