package com.atguigu.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestBufferedReader {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\file\\hello.txt");
            // 创建了一个字符输入节点流
            FileReader fr = new FileReader(file);
            // 创建了一个带缓冲区的字符输入处理流
            BufferedReader br = new BufferedReader(fr);

            while(true){
                String line = br.readLine();// 一次读取一行
                if(line == null){
                    break;
                }
                System.out.println(line);
            }

            fr.close();
            br.close();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
