package com.atguigu.test1;

public class Master {
    public void shangKe(Teacher teacher){
        if(teacher instanceof EnglishTeacher){
            EnglishTeacher et = (EnglishTeacher) teacher;
            et.jingKe();
            et.tingLi();
        }else{
            teacher.jingKe();
        }
    }
}
