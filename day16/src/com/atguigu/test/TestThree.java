package com.atguigu.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestThree {
    @Test
    public void test(){
        // List接口的特点：有序(遍历顺序和新增顺序一致)，允许重复元素。有下标
        // List接口的独有方法
        List list = new ArrayList();
        List listOne = new ArrayList();
        listOne.add("小明");
        listOne.add("小白");
        listOne.add("小黑");

        list.add("Tom");
        list.add("Mary");
        list.add("Jerry");
        list.add("Mary");
        System.out.println(list.size());
        list.add(1,"sanmao");// 指定索引新增元素
        System.out.println(list.size());
        System.out.println(list);
        list.addAll(1,listOne);// 将参数集合中所有的元素新增到原集合的指定索引处
        System.out.println(list);
        System.out.println(list.size());
        list.set(1,"小强");// 替换指定索引处元素
        System.out.println(list.size());
        System.out.println(list);

        int index = list.indexOf("Tom");// 搜索参数元素在集合中第一次出现的索引
        System.out.println(index);
        list.add("Tom");
        int index1 = list.lastIndexOf("Tom");// 搜索参数元素在集合中最后一次出现的索引
        System.out.println(index1);

        List subList = list.subList(2,6);// 从第一个参数索引开始截取到第二个参数索引的前一位
        System.out.println(subList);

        list.remove("Tom");// 指定元素移除
        System.out.println(list);
        list.remove(0);// 指定索引移除
        System.out.println(list);

        List listTwo = new ArrayList();
        listTwo.add(100);
        listTwo.add(200);
        listTwo.add(300);
        listTwo.remove(new Integer(100));
        System.out.println(listTwo);

        Object obj = list.get(0);// 返回参数指定处元素

    }

    @Test
    public void test1(){
        // 遍历List接口
        List list = new ArrayList();
        list.add("Tom");
        list.add("Mary");
        list.add("Jerry");
        list.add("Mary");
        
        // 增强for循环
        for (Object o : list) {
            System.out.println(o);
        }

        // 迭代器
        Iterator iter = list.iterator();
        while(iter.hasNext()){
            Object o = iter.next();
            System.out.println(o);
        }
        
        // 传统for循环
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
    }
}
