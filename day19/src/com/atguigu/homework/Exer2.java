package com.atguigu.homework;

import java.io.File;
import java.io.IOException;

/**
 * @author lystart
 * @create 2023-02-27 18:45
 */
public class Exer2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\testIO\\a.txt");
        if (file.exists()) {
            file.createNewFile();
        }
        System.out.println(file.getName());// 文件名
        System.out.println(file.length());// 文件大小
        System.out.println(file.getPath());// 文件的绝对路径
        System.out.println(file.getParent());// 父路径信息

        File file1 = new File("d:testIO");
        if (file1.isDirectory()) {
            System.out.println("testIO是一个文件夹");
        } else if (file1.isFile()) {
            System.out.println("testIO是一个文件");

        }
        File file2 = new File("d:testIO");
        System.out.println(file2.delete());
        File file3 = new File("F:\\IDEA\\java230201\\day19\\testIO");
        System.out.println(file3.delete());
    }
}
