package com.atguigu.test;

import java.util.*;

public class TestTwo {
    public static void main(String[] args) {
        // Map接口的遍历
        Map map = new HashMap();

        map.put("班长","美国");// 将键值对元素存放到集合中
        map.put("学委","中国");
        map.put("体委","俄罗斯");
        map.put("文委","意大利");

        Set keys = map.keySet();// 返回键集
        Iterator iter = keys.iterator();
        while(iter.hasNext()){
            String key = (String)iter.next();
            String value = (String)map.get(key);
            System.out.println(key+"="+value);
        }

        Collection values = map.values();// 返回值集
        Iterator iter1 = values.iterator();
        while(iter1.hasNext()){
            String value = (String)iter1.next();
            System.out.println(value);
        }

        Set entrySet = map.entrySet();// 返回键值对集
        Iterator iter2 = entrySet.iterator();
        while(iter2.hasNext()){
            Map.Entry entry = (Map.Entry)iter2.next();
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
