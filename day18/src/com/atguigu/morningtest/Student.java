package com.atguigu.morningtest;

// 自然排序
public class Student implements Comparable{
    private String stuName;
    private int stuAge;
    private String stuGender;

    public Student() {
    }

    public Student(String stuName, int stuAge, String stuGender) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
    }

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

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender='" + stuGender + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student stu = (Student)o;
        int result = this.getStuAge() - stu.getStuAge();
        if(result == 0){
            result = this.getStuName().compareTo(stu.getStuName());
        }
        if(result == 0){
            result = this.getStuGender().compareTo(stu.getStuGender());
        }
        return result;
    }
}
