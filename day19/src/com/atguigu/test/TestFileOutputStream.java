package com.atguigu.test;

import java.io.File;
import java.io.FileOutputStream;

public class TestFileOutputStream {
    public static void main(String[] args) {
        try{
            // 创建File对象
            File file = new File("day19\\file\\hello1.txt");
            if(!file.exists()){
                file.createNewFile();// 创建硬盘文件
            }
            // FileOutputStream fos = new FileOutputStream(file);// 覆盖式输出
            FileOutputStream fos = new FileOutputStream(file,true);// 追加式输出
            fos.write(97);// 一次输出一个字节

            String s = "hello world";
            byte[] bs = s.getBytes();
            fos.write(bs);// 一次输出一个字节数组

            fos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
