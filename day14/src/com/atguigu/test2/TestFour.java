package com.atguigu.test2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestFour {
    public static void main(String[] args) {
        // JDK1.8之前的日期处理
        Date date = new Date();// 利用创建对象时的系统时间创建一个日期对象
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDate());
        System.out.println(date.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s);

        Calendar cal = Calendar.getInstance();// 根据创建对象时的系统时间创建日期对象
        System.out.println(cal);
        System.out.println(cal.get(Calendar.YEAR));// 根据参数获取日期的局部
        System.out.println(cal.get(Calendar.MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        cal.add(Calendar.HOUR_OF_DAY,-1000);
        System.out.println(cal);
        Date date1 = cal.getTime();// Calendar对象变Date对象
        String s1 = sdf.format(date1);
        System.out.println(s1);
    }
}
