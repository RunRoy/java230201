package com.atguigu.homework;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;

/**
 * @author lystart
 * @create 2023-02-27 18:04
 */
public class Exer1 {
    public static void main(String[] args) {
        try{
//            File file = new File("D:\\testIO\\1.txt");
            File file2 = new File("day19\\testIO\\1.txt");
//            if(!file2.exists()){
//                file2.createNewFile();// 创建硬盘文件
//            }
//          FileOutputStream fos = new FileOutputStream(file);
//          String s = "HelloWord";
//            byte[] bytes = s.getBytes();
//            fos.write(bytes);

            FileOutputStream foss = new FileOutputStream(file2,true);
            String s1 = "HelloWord";
            byte[] bytes1 = s1.getBytes();
            foss.write(bytes1);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
