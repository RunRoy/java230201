package com.atguigu.test;

public class TestThree {
    public static void main(String[] args) {
        // try块不能独立存在，需要和catch或者和finally块一起出现
        try{

        }catch (Exception ex){

        }

        try{

        }finally {

        }

        // finally块的特点：无论是否出现异常，finally都会执行
        try{
            System.out.println("begin try");
            int x = 5 / 2;
            System.out.println("end try");
            return;
            // System.exit(0);
        }catch (Exception ex){
            System.out.println("in catch");
            ex.printStackTrace();
        }finally {
            System.out.println("in finally");
        }
        System.out.println("程序结束");
    }
}
