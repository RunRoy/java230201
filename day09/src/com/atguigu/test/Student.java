package com.atguigu.test;

// 单个类的初始化顺序：先静态再普通，先代码块再构造方法
public class Student extends Person{
    private String stuName;
    private int stuAge;
    private String gender;
    public static String school;

    // 静态代码块
    // 静态代码块随着类的加载按照编写的顺序依次调用
    // 静态代码块用于为静态成员初始化
    static{
        System.out.println("in Student static block one");
        school = "尚硅谷";
    }

    static{
        System.out.println("in Student static block two");
    }

    // 代码块
    // 代码块在创建对象时调用，按照编写的顺序依次调用，代码块的调用早于构造方法
    {
        System.out.println("in Student block one");
    }

    {
        System.out.println("in Student block three");
    }

    {
        System.out.println("in Student block two");
    }

    public Student(){
        System.out.println("in Student()");
    }

    public Student(String stuName, int stuAge) {
        System.out.println("in Student(String,int)");
        this.stuName = stuName;
        this.stuAge = stuAge;
        // school = "尚硅谷";
    }

    public Student(String stuName, int stuAge, String gender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}
