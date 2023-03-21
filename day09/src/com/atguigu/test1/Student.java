package com.atguigu.test1;

import java.util.Objects;

public class Student {
    // private int stuId;
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

//    public Student(int stuId, String stuName, int stuAge, String stuGender) {
//        this.stuId = stuId;
//        this.stuName = stuName;
//        this.stuAge = stuAge;
//        this.stuGender = stuGender;
//    }

//    public int getStuId() {
//        return stuId;
//    }
//
//    public void setStuId(int stuId) {
//        this.stuId = stuId;
//    }

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

//    @Override
//    public boolean equals(Object obj) {
//        boolean flag = false;
//        if(this == obj){
//            flag = true;
//        }else{
//            if(obj instanceof Student){
//                Student stu = (Student)obj;
//                if(this.getStuName().equals(stu.getStuName())
//                        &&this.getStuAge() == stu.getStuAge()
//                        &&this.getStuGender().equals(stu.getStuGender())){
//                    flag = true;
//                }
//            }
//        }
//        return flag;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStuAge() == student.getStuAge() && getStuName().equals(student.getStuName()) && getStuGender().equals(student.getStuGender());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStuName(), getStuAge(), getStuGender());
    }
}
