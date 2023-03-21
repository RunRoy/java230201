package com.atguigu.test2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestFive {
    public static void main(String[] args) {
        // jdk1.8之后的日期处理
        // 没有时间的日期格式
        LocalDate localDate = LocalDate.now();// 获取当时的系统时间
        LocalDate localDate1 = LocalDate.of(2023,1,10);// 指定时间创建对象

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonth().getValue());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfWeek().getValue());
        System.out.println("--------------------------------------------");
        // 没有日期的时间格式
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(16,53,35);
        System.out.println(localTime);

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());// 获取纳秒

        System.out.println("-----------------------------------------------");
        // 既有日期又有时间
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2023,1,10,8,37,24);

    }
}
