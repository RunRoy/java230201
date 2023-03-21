package com.atguigu.homework.test2;

/**
 * @author lystart
 * @create 2023-02-17 19:24
 */
public class Test02 {
     {
        System.out.println("a");
    }
    static{
        System.out.println("b");
    }
    Test02(){
        System.out.println("c");
    }
    public static String getOut(){
        try{
            return "1";
        }catch(Exception e){
            return "2";
        }finally{
            return "3";
        }
    }
    public static void main(String[] args) {
        System.out.println(getOut());
    }
}
