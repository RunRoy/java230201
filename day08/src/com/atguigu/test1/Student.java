package com.atguigu.test1;

// 私有属性，属性提供公开的get/set方法，且类中包含无参构造方法，这种类叫JavaBean
public class Student {
    private String stuName;
    private int stuAge;

    public Student() {
    }

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    //    public String getStuName(){
//        return stuName;
//    }
//
//    public void setStuName(String stuName){
//        this.stuName = stuName;
//    }
//
//    public int getStuAge(){
//        return stuAge;
//    }
//
//    public void setStuAge(int stuAge){
//        if(stuAge >= 20 && stuAge <= 40) {
//            this.stuAge = stuAge;
//        }else{
//            this.stuAge = 20;
//        }
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

    public String getInfo(){
        return "学生名："+stuName+"，学生年龄："+stuAge;
    }
}
