package com.atguigu.homework.Exe2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.naming.Name;
import java.util.*;

/**
 * @author lystart
 * @create 2023-02-23 20:22
 */
public class StudentTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List list = new ArrayList();
        int next;
        while (true) {
            System.out.println("选择（1、录入；0、退出）：");
            next = input.nextInt();
            if (next == 1) {
                System.out.print("姓名");
                String name = input.next();
                System.out.print("年龄");
                int age = input.nextInt();
                list.add(new Student(name, age));
            } else if (next == 0) {
                break;
            }
        }
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
