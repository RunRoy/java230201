package com.atguigu.homework;

import java.util.*;

/**
 * @author lystart
 * @create 2023-02-24 20:58
 */
public class Exer3 {
    public static void main(String[] args) {

        Set set = new TreeSet();
        List list = new ArrayList();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        Random ran = new Random();

        for (int i = 1; i <= 33; i++) {
            list.add(i);
        }
        for (int i = 1; i <= 16; i++) {
            list1.add(i);
        }

        for (Object o : set) {
            list.get(0);
        }
        System.out.println("蓝色号码：" + list.get(ran.nextInt(16)));

        while (set.size() < 6){
            set.add(list.get(ran.nextInt(33)));
        }
        System.out.print("红色号码："+set);

        list2.add(list1.get(ran.nextInt(16)));
        System.out.println("蓝色号码："+list2);



    }
}
