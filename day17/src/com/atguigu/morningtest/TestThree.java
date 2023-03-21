package com.atguigu.morningtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestThree {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Tom");
        list.add("Jerry");
        list.add("Mary");
        list.add("June");

        for (int i = 0; i < list.size(); i++) {
            String s = (String)list.get(i);
            System.out.println(s);
        }

        for (Object o : list) {
            String s = (String)o;
            System.out.println(s);
        }

        Iterator iter = list.iterator();
        while(iter.hasNext()){
            String s = (String)iter.next();
            System.out.println(s);
        }
    }
}
