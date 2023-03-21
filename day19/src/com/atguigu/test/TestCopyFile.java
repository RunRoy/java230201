package com.atguigu.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestCopyFile {
    public static void main(String[] args) {
        // 文件复制
        try{
            File fileOne = new File("day19\\file\\个人分享（图片辅助）.pptx");
            File fileTwo = new File("day19\\file\\个人分享（图片辅助）(副本).pptx");

            if(!fileTwo.exists()){
                fileTwo.createNewFile();
            }

            FileInputStream fis = new FileInputStream(fileOne);
            FileOutputStream fos = new FileOutputStream(fileTwo);

            byte[] bs = new byte[1024];

            while(true){
                int length = fis.read(bs);// 返回值为读取到字节数组中的有效长度
                if(length == -1){
                    break;
                }
                fos.write(bs,0,length);
            }

            fis.close();
            fos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
