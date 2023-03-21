package com.atguigu.test;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class TestThree {
    public static void main(String[] args) {
        // HashMap类的特点：HashMap底层使用链表+数组存储数据，从JDK1.8开始使用链表+数组+红黑树存储数据
        // 在第一次调用put方法时为数组进行初始化，初始化长度为16.在集合中元素数超过临界值时，数组扩容，
        // 按照原数组长度的两位扩容，扩容后数组重新分散。临界值是当前数组长度乘以负载因子。负载因子在创建HashMap
        // 时在构造方法中被赋值0.75，且不再改变。如果单个链表元素超过8个，但数组长度没有达到64，则数组扩容
        // 如果单个链表元素超过8个，且数组长度已经达到64了，则会将链表结构变成红黑树结构
        Map map = new HashMap();
        map.put("班长","Tom");
    }



    @Test
    public void zhojiang(){
        System.out.println("中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中中");
    }

}
