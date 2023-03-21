package com.atguigu.morningtest.homework;

/**
 * @author lystart
 * @create 2023-02-11 23:51
 */
public class Test2 {
    public static void main(String[] args) {
        Person[] arr = new Person[2];
        arr[0] = new Man();
        arr[0].setName("马云");
        arr[0].setAge(18);
        arr[0].setOccupation("java开发");
        
        arr[1] = new Woman();
        arr[1].setName("蒂法");
        arr[1].setAge(21);
        arr[1].setOccupation("前端开发");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getInfo());
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].eat();
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].toilet();
            if(arr[i] instanceof Man){
                Man man = (com.atguigu.morningtest.homework.Man) arr[i];
                 man.smoke();
            }else if(arr[i] instanceof Woman){
                Woman woman = (Woman) arr[i];
                woman.makeup();
            }
        }
    }
}
