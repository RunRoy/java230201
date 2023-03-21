package com.atguigu.test1;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestOne {
    public static void main(String[] args) {
        // LinkedHashSet的特点:既去重又有序。LinkedHashSet底层存储和去重的方式与HashSet一致
        // LinkedHashSet除了存储元素的链表数组外，还会维护一个单独的链表，这个链表记录了数据的新增顺序
        Set set = new LinkedHashSet();

        set.add("Jerry");
        set.add("Tom");
        set.add("June");
        set.add("Mary");

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
