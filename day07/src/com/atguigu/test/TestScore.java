package com.atguigu.test;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CountScore cs = new CountScore();
        System.out.println("请输入语文成绩");
        int yuwen = input.nextInt();
        System.out.println("请输入数学成绩");
        int math = input.nextInt();
        System.out.println("请输入英语成绩");
        int english = input.nextInt();
        // 调用带参的方法，必须按照方法的要求传参
        // 方法的形参个数要求，类型要求，顺序要求
        // 调用带参方法时，需要按照传入顺序依次由实参为形参赋值
        // 形参名和实参名可以不一样，但是形参类型和实参类型必须一致
        // 实参将自己的值传递给方法为形参赋值
        int sum = cs.countSum(100,math,english);
        System.out.println("sum="+sum);
        int avg = cs.countAvg(yuwen,math,english);
        System.out.println("avg="+avg);
    }
}
