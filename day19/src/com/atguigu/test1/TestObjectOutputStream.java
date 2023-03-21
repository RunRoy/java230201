package com.atguigu.test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestObjectOutputStream {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\file\\object.txt");
            if(!file.exists()) {
                file.createNewFile();
            }
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            User user = new User("Tom","123456");
            oos.writeObject(user);
            oos.flush();// 清空缓冲区

            oos.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
