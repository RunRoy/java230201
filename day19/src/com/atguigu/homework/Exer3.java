package com.atguigu.homework;

import java.io.*;

/**
 * @author lystart
 * @create 2023-02-27 19:18
 */
public class Exer3 implements Serializable {
    public static void main(String[] args) throws Exception{

        try {
            File file = new File("F:\\day01\\DAY00\\课件\\尚硅谷-第14章 File类与IO流\\尚硅谷_张锐_JavaSE_第14章 File类与IO流.md");
            File file1 = new File("F:\\IDEA\\java230201\\day19\\testIO\\(副本)尚硅谷_张锐_JavaSE_第14章 File类与IO流.md");

            BufferedInputStream bis = new BufferedInputStream( new FileInputStream(file));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file1));
            byte[] bytes = new byte[1024];
            while (true) {
                int length = bis.read(bytes);
                if (length == -1) {
                    break;
                }
                bos.write(bytes, 0, length);
            }
            bos.flush();
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
