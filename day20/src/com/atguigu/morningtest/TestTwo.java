package com.atguigu.morningtest;

import java.io.File;
import java.io.IOException;

public class TestTwo {
    public static void main(String[] args) {
        // File类的常用方法
        File file = new File("day20\\file\\尚硅谷_张锐_JavaSE_第15章 网络编程.md");

        System.out.println(file.exists());// 判断硬盘上是否存在该文件
        System.out.println(file.length());// 返回文件夹大小，单位为字节
        System.out.println(file.getName());// 返回没有路径的文件名
        System.out.println(file.getParent());// 返回文件所在的路径名
        System.out.println(file.getParentFile());// 返回文件所在路径的文件对象
        System.out.println(file.getPath());// 返回文件的完整路径，考虑创建文件时的路径方式
        System.out.println(file.getAbsolutePath());// 返回文件的绝对路径
        System.out.println(file.getAbsoluteFile());// 返回文件绝对路径下创建的文件对象
        try {
            file.getCanonicalPath();// 返回文件的绝对路径
            file.getCanonicalFile();// 返回文件绝对路径下创建的文件对象
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(file.isFile());// 判断是否为文件对象
        System.out.println(file.isDirectory());// 判断是否为文件夹对象
        System.out.println(file.isHidden());// 判断是否为隐藏文件
        System.out.println(file.canRead());// 判断文件是否可读
        System.out.println(file.canWrite());// 判断文件是否可写

        if(file.isFile()){
            try {
                file.createNewFile();// 创建硬盘文件
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if(file.isDirectory()){
            file.mkdir();// 创建硬盘文件夹，只能创建最后一级
            file.mkdirs();// 创建硬盘文件夹，可以创建多级

            String[] names = file.list();// 返回文件夹下所有文件及子文件夹名字的数组
            File[] files = file.listFiles();// 返回文件夹下所有文件及子文件夹的文件对象数组
        }

        file.delete();// 删除硬盘文件或者文件夹，删除文件夹时文件夹必须为空
    }
}
