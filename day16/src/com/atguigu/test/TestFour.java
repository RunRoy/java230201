package com.atguigu.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestFour {
    @Test
    public void test(){
        // ArrayList实现类底层使用可变长度数组实现，ArrayList遍历效率高，频繁增删效率低
        // 在第一次调用add方法新增元素时为数组进行初始化，初始化长度为10
        // ArrayList在元素数超过数组长度时扩容，按照原来长度的1.5倍扩容
        List list = new ArrayList();
        list.add("Tom");
    }

    @Test
    public void test1(){
        // LinkedList底层使用双向链表实现，频繁增删效率高，遍历效率低
        // LinkedList有一套对首尾元素单独操作的方法
        LinkedList list = new LinkedList();
        list.add("Mary");
        list.addFirst("Tom");
        list.addLast("Jerry");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
    }

}
