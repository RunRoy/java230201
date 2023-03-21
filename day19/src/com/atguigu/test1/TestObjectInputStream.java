package com.atguigu.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestObjectInputStream {
    public static void main(String[] args) {
        try{
            File file = new File("day19\\file\\object.txt");
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            User user = (User)ois.readObject();
            System.out.println(user);
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
