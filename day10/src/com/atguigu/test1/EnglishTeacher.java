package com.atguigu.test1;

public class EnglishTeacher implements Teacher{
    @Override
    public void jingKe() {
        System.out.println("讲英语课");
    }

    public void tingLi(){
        System.out.println("听力课");
    }
}
