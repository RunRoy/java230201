package com.atguigu.test1;

import java.util.Set;
import java.util.TreeSet;

public class TestStudent {
    public static void main(String[] args) {
        Set set = new TreeSet();

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",22,"男");
        Student stu2 = new Student("Mary",21,"女");
        Student stu3 = new Student("June",21,"女");

        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
