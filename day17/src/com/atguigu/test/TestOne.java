package com.atguigu.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestOne {
    public static void main(String[] args) {
        // Set接口的特点：无序(新增顺序和遍历顺序不一致)，不允许重复记录(去重)，无下标
        // Set接口没有独有方法
        Set set = new HashSet();

        set.add("Mary");
        set.add("Tom");
        set.add("June");
        set.add("Jerry");
        set.add("Jerry");
        set.add("Jerry");
        set.add("Jerry");



        System.out.println(set);

        for (Object o : set) {
            System.out.println(o);
        }

        Iterator iter = set.iterator();
        while(iter.hasNext()){
            Object o = iter.next();
            System.out.println(o);
        }
    }
}
