package com.atguigu.test1;

import java.util.Set;
import java.util.TreeSet;

public class TestTwo {
    public static void main(String[] args) {
        // TreeSet的特点：底层使用红黑树存储，需要元素可以进行排序
        Set set = new TreeSet();

        set.add("Tom");
        set.add("Jerry");
        set.add("Dary");
        set.add("Jane");
        set.add("Mao");

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
