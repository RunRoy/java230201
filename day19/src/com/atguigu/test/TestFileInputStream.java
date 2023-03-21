package com.atguigu.test;

import java.io.File;
import java.io.FileInputStream;

public class TestFileInputStream {
    public static void main(String[] args) {
        try{
            // File对象
            File file = new File("day19\\file\\hello.txt");
            // FileInputStream对象
            FileInputStream fis = new FileInputStream(file);
            // 获取文件中的数据
//            while(true){
//                int code = fis.read();// 一次读取一个字节
//                if(code == -1){
//                    break;
//                }
//                char c = (char)code;
//                System.out.print(c);
//            }
            byte[] datas = new byte[(int)file.length()];
            fis.read(datas);
            String s = new String(datas);
            System.out.println(s);
            fis.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
