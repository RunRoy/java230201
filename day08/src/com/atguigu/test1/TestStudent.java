package com.atguigu.test1;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        // stu.stuName = "Tom";
        stu.setStuName("Tom");
        System.out.println(stu.getStuName());
        // stu.stuAge = 200;
        // System.out.println(stu.stuAge);
        stu.setStuAge(200);
        System.out.println(stu.getStuAge());
    }
}
