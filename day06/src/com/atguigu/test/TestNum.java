package com.atguigu.test;

import java.util.Scanner;

public class TestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CountNum cn = new CountNum();
        System.out.println("请输入第一个操作数");
        cn.one = input.nextInt();
        System.out.println("请输入第二个操作数");
        cn.two = input.nextInt();
        System.out.println("请输入运算符");
        cn.opt = input.next();

//        int result = cn.count();
//        System.out.println("结果是："+result);
        System.out.println("结果是"+cn.count());
    }
}
