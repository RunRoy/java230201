package com.atguigu.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TestInputStreamReader {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\file\\hello3.txt");
            // 字节节点流
            FileInputStream fis = new FileInputStream(file);
            // 字符处理流，一个转换流可以把一个字节节点流转换成字符处理流
            InputStreamReader isr = new InputStreamReader(fis,"GBK");

            while(true){
                int code = isr.read();
                if(code == -1){
                    break;
                }
                char c = (char)code;
                System.out.print(c);
            }

            isr.close();
            fis.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
