package com.atguigu.test2;

public class Student {
    // @MyAnno(value = "ok",age = 20)
    private String stuName;
    // @MyAnno(value = "hello")
    private int stuAge;

    @MyAnno("hello")
    public Student() {
    }

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    @MyAnno("hello")
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public void study(){
        System.out.println("好好学习");
    }
}
