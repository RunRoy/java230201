package com.atguigu.test;

public class TestStudent {
    public static void main(String[] args){
        Student stu = new Student();
        stu.setStuName("Tom");
        try {
            stu.setStuAge(10);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        // Class.forName("");
        System.out.println("程序结束");
    }
}
