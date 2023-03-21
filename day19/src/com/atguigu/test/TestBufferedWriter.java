package com.atguigu.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TestBufferedWriter {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\file\\hello2.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            // 创建一个字符输出节点流，追加模式需要加载节点流上
            FileWriter fw = new FileWriter(file,true);
            // 创建一个带有缓冲区的字符输出处理流
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("床前明月光");
            bw.newLine();// 换行
            bw.write("疑是地上霜");
            bw.newLine();

            bw.close();
            fw.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
