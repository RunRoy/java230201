package com.atguigu.morningtest.homework.Exe2;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Scanner;

/**
 * @author lystart
 * @create 2023-02-13 18:17
 */
public class Test2 {
    public static void main(String[] args) {
        Person[] per = new Person[4];

        per[0] = new Man();
        per[0].setName("张三");
        per[0].setAge(18);
        per[0].setCareer("初级程序员");

        per[1] = new Man();
        per[1].setName("李四");
        per[1].setAge(19);
        per[1].setCareer("中级程序员");

        per[2] = new Man();
        per[2].setName("罗亚");
        per[2].setAge(21);
        per[2].setCareer("究极程序员");

        per[3] = new Woman();
        per[3].setName("LinNa");
        per[3].setAge(19);
        per[3].setCareer("中级程序员");


        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i].getInfo());
        }

        for (Person value : per) {
            value.eat();
        }

        for (int i = 0; i < per.length; i++) {
            per[i].toilet();
            if (per[i] instanceof Man) {
                ((Man) per[i]).smoke();
            } else {
                ((Woman) per[i]).makeup();
            }
        }
    }
}
