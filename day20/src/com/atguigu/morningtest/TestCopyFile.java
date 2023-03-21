package com.atguigu.morningtest;

import java.io.*;

public class TestCopyFile {
    public static void main(String[] args) {
        try{
            File fileOne = new File("day20\\file\\尚硅谷_张锐_JavaSE_第15章 网络编程.md");
            File fileTwo = new File("day20\\file\\尚硅谷_张锐_JavaSE_第15章 网络编程(副本).md");
            if(!fileTwo.exists()){
                fileTwo.createNewFile();
            }
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileOne));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileTwo));
            byte[] datas = new byte[1024];

            while(true){
                int length = bis.read(datas);// 返回是读取到数组中的有效数据长度
                if(length == -1){
                    break;
                }
                bos.write(datas,0,length);
            }

            bis.close();
            bos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
