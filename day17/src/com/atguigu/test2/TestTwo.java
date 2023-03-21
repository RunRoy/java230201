package com.atguigu.test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTwo {
    public static void main(String[] args) {
        // Collections工具类
        List list = new ArrayList();

        list.add("Tom");
        list.add("Jerry");
        list.add("Mary");
        list.add("Mary");
        list.add("Mary");

        System.out.println(list);
        Collections.addAll(list,"sanmao","xiaoqiang","xiaobai");// 将多个数组添加进第一个参数集合中
        System.out.println(list);

        Collections.sort(list);// 利用集合中元素的自然排序规则升序排列
        System.out.println(list);
        int index = Collections.binarySearch(list,"Tom");
        System.out.println(index);

        Object max = Collections.max(list);// 使用元素自然排序排列搜索最大值
        System.out.println(max);
        Object min = Collections.min(list);// 使用元素自然排序排列搜索最小值
        System.out.println(min);

        System.out.println(list);
        Collections.reverse(list);// 翻转集合元素
        System.out.println(list);
        Collections.shuffle(list);// 随机排序集合中的元素
        System.out.println(list);
        Collections.swap(list,1,4);// 交换两个索引处的元素
        System.out.println(list);
        int count = Collections.frequency(list,"Mary");// 元素在集合中出现的次数
        System.out.println(count);
        List newList = new ArrayList(list.size());

        for (int i = 0; i < list.size(); i++) {
            newList.add("");
        }

        Collections.copy(newList,list);// 从一个集合中复制所有元素到另一个集合
        System.out.println(newList);

        Collections.replaceAll(list,"Mary","如花");// 使用新的元素替换集合中所有的原来的元素
        System.out.println(list);
    }
}
