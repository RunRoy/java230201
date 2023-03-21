package com.atguigu.morningtest;

import java.util.*;

public class TestTwo {
    public static void main(String[] args) {
        // 泛型的集合
        List<String> list = new ArrayList<>();
        list.add("Tom");
        String s = list.get(0);
        list.remove("Tom");

        Set<String> set = new HashSet<>();
        set.add("Tom");

        Map<String,String> map = new HashMap<>();
        map.put("班长","Jerry");
        String value = map.get("班长");
    }
}
