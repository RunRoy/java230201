package com.atguigu.morningtest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestTwo {
    public static void main(String[] args) {
        // JDK1.8之后的日期处理
        // 没有时间的日期格式
        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2023,2,21);

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfWeek().getValue());
        System.out.println("---------------------------------------------");
        // 没有日期的时间格式
        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.of(9,2,20);

        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println("-----------------------------------------");
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2023,2,21,9,3,50);

        System.out.println(localDateTime);
    }
}
