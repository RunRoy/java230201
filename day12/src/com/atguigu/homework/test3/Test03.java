package com.atguigu.homework.test3;

/**
 * @author lystart
 * @create 2023-02-17 19:24
 */
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        int a = -1;
        try{
            if(a>0){
                throw new RuntimeException("");
            }else if(a<0){
                throw new IOException("");//--------------------------
            }else{
                return ;
            }
        }catch(IOException ioe){
            System.out.println("IOException");//-------------------
        }catch(Throwable e){
            System.out.println("Throwable");
        }finally{
            System.out.println("finally");//===================
        }
    }
}
