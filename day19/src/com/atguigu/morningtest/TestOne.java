package com.atguigu.morningtest;

import java.util.*;

public class TestOne {
    public static void main(String[] args) {
        // Map接口的常用方法
        Map<String,String> map = new HashMap<>();
        Map<String,String> map1 = new HashMap<>();

        map.put("班长","Tom");// 将键值对元素存放到集合中
        map.remove("班长");// 使用键做检索条件移除键值对
        map.remove("班长","Tom");// 使用键值同时做检索条件移除键值对
        map.putAll(map1);// 将参数集合中所有键值对存放到当前进集合中
        map.replace("班长","Jerry");// 使用键做检索条件用新值替换原值
        map.replace("班长","Tom","Jerry");// 使用键值同时做检索条件用新值替换原值
        String value = map.get("班长");// 用键取值
        System.out.println(map.size());// 返回集合中当前的元素数
        System.out.println(map.isEmpty());// 判断集合是否为空
        map.clear();// 清空集合
        map.containsKey("班长");// 判断集合中是否存在该键
        map.containsValue("Jerry");// 判断集合中是否存在该值

        map.put("学委","Mary");
        map.put("体委","Tom");
        map.put("文委","June");
        Set<String> keys = map.keySet();// 返回键集
        for (String key : keys) {
            String val = map.get(key);
            System.out.println(key+"="+val);
        }

        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()){
            String key = iter.next();
            String val = map.get(key);
            System.out.println(key+"="+val);
        }

        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println(s);
        }

        Iterator<String> iter1 = values.iterator();
        while(iter1.hasNext()){
            String val = iter1.next();
            System.out.println(val);
        }

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

        Iterator<Map.Entry<String,String>> iter2 = entrySet.iterator();
        while(iter2.hasNext()){
            Map.Entry<String,String> entry = iter2.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
