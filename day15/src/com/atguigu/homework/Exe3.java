package com.atguigu.homework;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-21 19:17
 */
public class Exe3 {
    public static void main(String[] args) {
        // 键盘录入一个源字符串储存在srcStr，再录入要删除的字符串存储再delStr变量中。
        Scanner input = new Scanner(System.in);
        System.out.println("请输入源字符串");
        String srcStr = input.next();
        System.out.println("请输入要删除的字符串");
        String delStr = input.next();
        String[] num = srcStr.split(delStr);
//        System.out.println("源字符串中总共包含" + num.length + "个" + delStr);
        int in = (srcStr.length() - srcStr.replaceAll(delStr, "").length()) / delStr.length();
        System.out.println("源字符串中总共包含" + in + "个" + delStr);
        System.out.println("删除" + delStr + "后的字符串为：" + srcStr.replaceAll(delStr, ""));
    }
}
