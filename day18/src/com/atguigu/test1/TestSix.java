package com.atguigu.test1;

import java.util.*;

public class TestSix {
    public static void main(String[] args) {
        // 泛型的集合
        List<String> list = new ArrayList<>();
        list.add("Tom");
        String s = list.get(0);
        list.remove("Tom");

        Set<String> set = new HashSet<>();
        set.add("Tom");

        // 迭代器也需要指定泛型，迭代器泛型必须和产生迭代器的集合泛型一致
        Iterator<String> iter = set.iterator();
        while(iter.hasNext()){
            String s1 = iter.next();
        }

        Map<String,String> map = new HashMap<>();
        map.put("班长","Tom");
        String value = map.get("班长");
    }
}
