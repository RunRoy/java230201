package com.atguigu.test2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.atguigu.test1.Student;

public class TestOne {
    public static void main(String[] args) {
        // 定制排序：创建集合时创建一个比较器对象传入到构造方法中
        // 定制排序的优先级高于自然排序
        Set set = new TreeSet(new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Student stu1 = (Student)o1;
                Student stu2 = (Student)o2;
                int result = stu2.getStuAge() - stu1.getStuAge();
                if(result == 0){
                    result = stu2.getStuName().compareTo(stu1.getStuName());
                }
                if(result == 0){
                    result = stu2.getStuGender().compareTo(stu1.getStuGender());
                }
                return result;
            }
        });

        Student stu = new Student("Tom",20,"男");
        Student stu1 = new Student("Jerry",22,"男");
        Student stu2 = new Student("Jary",21,"女");
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
