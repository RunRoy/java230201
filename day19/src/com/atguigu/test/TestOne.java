package com.atguigu.test;

import java.io.File;
import java.io.IOException;

public class TestOne {
    public static void main(String[] args) {
        // File类的常用方法
        // File file = new File("D:\\temp\\hello.txt");// 绝对路径
        File file = new File("day19\\file\\hello.txt");// 相对路径
        System.out.println(file);
        System.out.println(file.exists());// 判断路径上是否真是存在文件或者文件夹
        System.out.println(file.length());// 文件的大小，单位是字节
        System.out.println(file.getName());// 不包含路径的文件名
        System.out.println(file.getParent());// 返回文件所在文件夹的路径
        System.out.println(file.getParentFile());// 返回文件所在文件夹的文件对象
        System.out.println(file.getPath());// 返回一个文件的完整路径，考虑文件创建时的路径形式
        System.out.println(file.getAbsolutePath());// 返回一个文件的绝对路径
        System.out.println(file.getAbsoluteFile());// 返回一个文件的绝对路径形式的文件对象
        try {
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getCanonicalFile());
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println(file.isFile());// 判断File对象是否为文件
        System.out.println(file.isDirectory());// 判断File对象是否为文件夹
        System.out.println(file.isHidden());// 判断是否为隐藏文件
        System.out.println(file.canRead());// 判断文件是否可读
        System.out.println(file.canWrite());// 判断文件是否可写
        System.out.println(file.exists());// 判断文件是否存在

        if(file.isFile()){
            try {
                file.createNewFile();// 创建硬盘文件
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if(file.isDirectory()){
            file.mkdir();// 创建硬盘文件夹，只能创建最后一级
            file.mkdirs();// 创建硬盘文件夹，创建多级

            String[] names = file.list();// 返回文件下所有文件及子文件夹的名字数组
            File[] files = file.listFiles();// 返回文件下所有文件及子文件夹的文件对象数组
        }

        file.delete();// 删除文件或者文件夹，如果删除文件夹，需要文件夹必须为空
    }
}
