package com.atguigu.morningtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestTwo {
    public static void main(String[] args) {
        // List的独有方法
        List list = new ArrayList();
        List list1 = new ArrayList();

        list.add("Tom");
        list.add(0,"Jerry");// 向指定下标处新增元素
        System.out.println(list);
        list.addAll(0,list1);// 向指定下标处新增参数集合中的所有元素
        list.remove(0);// 指定索引移除元素
        list.set(0,"Mary");// 指定索引替换元素
        Object obj = list.get(0);// 返回指定索引元素
        int index = list.indexOf("Tom");// 返回参数元素第一次出现的索引
        int index1 = list.lastIndexOf("Tom");// 返回参数元素最后一次出现的索引
        List subList = list.subList(1,4);// 返回参数索引区间的子集合

        for (Object o : list) {
            System.out.println(o);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Iterator iter = list.iterator();
    }
}
