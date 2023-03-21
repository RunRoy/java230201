package com.atguigu.test;

import java.util.HashMap;
import java.util.Map;

public class TestOne {
    public static void main(String[] args) {
        // Map接口的特点：Map接口是一个键值对集合
        // Map接口的常用方法
        Map map = new HashMap();
        Map mapOne = new HashMap();
        mapOne.put("第一组组长","德国");
        mapOne.put("第二组组长","印度");
        System.out.println(map.size());// 当前集合中的元素数
        map.put("班长","美国");// 将键值对元素存放到集合中
        map.put("学委","中国");
        map.put("体委","俄罗斯");
        map.put("文委","意大利");
        System.out.println(map+"----------------");
        map.put("文委","法国");// put方法存元素时，如果遇到了键已经在集合中存在的情况，则不会增加size，会用新值替换原值
        System.out.println(map+"-------------------");
        System.out.println(map.size());
        System.out.println(map);
        map.putAll(mapOne);// 将参数Map中的所有元素添加进原Map
        System.out.println(map);
        // map.clear();// 清空集合
        System.out.println(map.isEmpty());// 判断集合是否为空
        map.remove("班长");// 以键为检索条件移除整个键值对
        map.remove("班长","美国");// 以键和值同时为检索条件移除整个键值对
        map.replace("班长","中国");// 使用键做检索条件，用新值替换原值
        map.replace("班长","美国","中国");// 用键值同时做检索条件，用新值替换原值
        Object obj = map.get("班长");// 用键取值

        System.out.println(map.containsKey("班长"));// 判断集合中是否存在该键
        System.out.println(map.containsValue("美国"));// 判断集合中是否存在该值
    }
}
