package com.atguigu.morningtest.homework.Exe3;


/**
 * @author lystart
 * @create 2023-02-13 20:40
 */
public class Test {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];

        emp[0] = new Employee(1,"王思聪",31,89.4);
        emp[1] = new Employee(2,"马云",21,100);
        emp[2] = new Programmer(3,"王健林",45,99);
        emp[3] = new Designer(4,"马化腾",55,10,503.9);
        emp[4] = new Architect(5,"罗亚",21,15000,20000,50000);

        for (int i = 0; i < emp.length; i++) {
            System.out.println(emp[i].getInfo());
        }



    }

}
