package com.atguigu.test;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu);// 对象在被打印或者拼接到String上时会自动调用toString()

        // System.out.println(Student.school);

        // "Tom".equals("Jerry");
        System.out.println("--------------------------------------");

        Student stu1 = new Student("Tom",20,"男");
        Student stu2 = new Student("Jerry",21,"男");
        Student stu3 = new Student("Mary",22,"女");
        Student stu4 = stu3;

        System.out.println(stu1 == stu2);
    }
}
