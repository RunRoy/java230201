package com.atguigu.test2;

import java.io.Serializable;

public class TestOne {
    public static void main(String[] args) {
        LangTeacher lt = new LangTeacher();

        methodOne(new LangTeacher());
        methodTwo(new LangTeacher());
        methodThree(new LangTeacher());

        Teacher teacher = lt;
        teacher.jingKe();
        Person person = lt;
        person.sayHello();


    }

    public static void methodOne(Teacher teacher){

    }

    public static void methodTwo(Person person){

    }

    public static void methodThree(Serializable serializable){

    }

}
