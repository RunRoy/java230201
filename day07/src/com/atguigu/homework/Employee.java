package com.atguigu.homework;

/**
 * @author lystart
 * @create 2023-02-10 21:30
 */
public class Employee {
    int id;
    String name;
    double salary;
    int age;

   public  String getLnfo(){
       return "编号" + id + "姓名" + name + "薪资" + salary + "年龄" + "age";
    }

    public void setInfo(int i,String n,double s,int a){
       id = i;
       name = n;
       salary = s;
       age = a;
    }

}
