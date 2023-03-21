package com.atguigu.test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class TestOutputStreamWriter {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\file\\hello3.txt");
            FileOutputStream fos = new FileOutputStream(file,true);
            OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
            osw.write('\n');
            osw.write("你好");

            osw.close();
            fos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
