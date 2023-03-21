package com.atguigu.test1;


public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("Tom",20,"男");
        Student stu2 = new Student("Jerry",21,"男");
        Student stu3 = new Student("Mary",22,"女");
        Student stu4 = new Student("Mary",22,"女");
        // Student stu4 = stu3;

        System.out.println(stu3 == stu4);
        System.out.println(stu3.equals(stu4));
    }
}
