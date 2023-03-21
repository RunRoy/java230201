package com.atguigu.test;

import java.util.HashSet;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        // 存放到HashSet中的元素，需要重写hashCode和equals方法，如果不重写仅能判断相同内存地址的对象相同
        Set set = new HashSet();

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",21,"男");
        Student stu2 = new Student("Mary",25,"女");
        Student stu3 = new Student("June",23,"女");
        Student stu4 = new Student("女",23,"June");
        Student stu5 = new Student("June",23,"女");

        set.add(stu);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);

        for (Object o : set) {
            System.out.println(o);
        }
    }
}
