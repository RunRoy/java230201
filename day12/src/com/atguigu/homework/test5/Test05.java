package com.atguigu.homework.test5;

/**
 * @author lystart
 * @create 2023-02-17 19:24
 */
public class Test05 {
    public static int aMethod(int i)throws Exception{
        try{
            return i / 10;
        }catch(Exception ex){
            throw new Exception("exception in aMethod");
        }finally{
            System.out.println("finally");//--------------
        }
    }
    public static void main(String[] args) {
        try {
            aMethod(0);
        } catch (Exception e) {
            System.out.println("exception in main");
        }
    }
}

