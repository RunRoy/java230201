package com.atguigu.homework;

import org.junit.Test;

import java.io.*;

/**
 * @author lystart
 * @create 2023-02-27 19:50
 */
public class Exer4 {
    public static void main(String[] args) throws IOException {

        File file = new File("F:\\IDEA\\java230201\\day19data.dat");
        if (!file.isFile()) {
            file.createNewFile();
        }
        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        System.out.println(oin.readInt());
        System.out.println(oin.readChar());
        System.out.println(oin.readDouble());
        System.out.println(oin.readBoolean());
        System.out.println(oin.readUTF());

        oin.close();
    }
    @Test
    public void test01() throws IOException {
        int a = 10;
        char c = 'a';
        double d = 2.5;
        boolean b = true;
        String str = "尚硅谷";
        File file1 = new File("F:\\IDEA\\java230201\\day19data.dat");
        ObjectOutputStream oop = new ObjectOutputStream(new FileOutputStream(file1));
        oop.writeInt(a);
        oop.writeChar(c);
        oop.writeDouble(d);
        oop.writeBoolean(b);
        oop.writeUTF(str);
        oop.flush();
        oop.close();
    }
}
