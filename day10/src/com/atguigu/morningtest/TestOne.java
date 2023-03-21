package com.atguigu.morningtest;

public class TestOne {
    public static void main(String[] args) {
        Master master = new Master();
        LangTeacher lt = new LangTeacher();
        MathTeacher mt = new MathTeacher();
        EnglishTeacher et = new EnglishTeacher();

        master.shangKe(lt);
        master.shangKe(mt);
        master.shangKe(et);
    }
}
