package com.atguigu.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestTwo {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add("Tom");
        col.add("Jerry");
        col.add("Mary");
        col.add("June");

        // 增强for循环遍历Collection
        // 小括号中以一个冒号为核心，冒号左侧一定是一个变量或者是一个对象
        // 冒号右侧一定是一个集合或者是有一个数组
        // 每次进入循环会从右侧的集合或者数组中提取一个元素赋值给冒号左侧的这个变量或者对象
        for(Object o : col){
            System.out.println(o);
            String s = (String)o;
            System.out.println(s.toUpperCase());
        }

        System.out.println("-------------------------------------------------------");
        // 迭代器遍历
        Iterator iter = col.iterator();// 返回一个迭代当前集合的迭代器对象
        while(iter.hasNext()){// 判断是否存在下一个元素
            Object o = iter.next();// 获取元素
            System.out.println(o);
            String s = (String)o;
            System.out.println(s.toUpperCase());
        }
    }
}
