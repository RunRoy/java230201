package com.atguigu.morningtest;

import javax.swing.text.StyleContext;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestOne {
    public static void main(String[] args) {
        // JDK1.8之前的日期处理
        Date date = new Date();
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);

        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR));
        cal.add(Calendar.YEAR,1000);


        // JDK1.8之前的日期处理
        Date date1 = new Date();
        System.out.println(date1.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");// 月要大写MM
        System.out.println(simpleDateFormat.format(date));

        // 通过方法获取对象
        Calendar instance = Calendar.getInstance();
        System.out.println(instance.get(Calendar.YEAR));


    }
}
