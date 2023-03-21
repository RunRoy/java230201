package com.atguigu.test;

import java.util.Scanner;

public class TestObjectScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CountObjectScore cs = new CountObjectScore();
        Score score = new Score();
        System.out.println("请输入语文成绩");
        score.lang = input.nextInt();
        System.out.println("请输入数学成绩");
        score.math = input.nextInt();
        System.out.println("请输入英语成绩");
        score.english = input.nextInt();
        // 调用带参的方法，必须按照方法的要求传参
        // 方法的形参个数要求，类型要求，顺序要求
        // 调用带参方法时，需要按照传入顺序依次由实参为形参赋值
        // 形参名和实参名可以不一样，但是形参类型和实参类型必须一致
        // 实参将自己的值传递给方法为形参赋值
        int sum = cs.countSum(score);
        System.out.println("sum="+sum);
        int avg = cs.countAvg(score);
        System.out.println("avg="+avg);
    }
}
