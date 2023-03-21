package com.atguigu.homework.exer5;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.junit.Test;

import java.io.*;
import java.sql.SQLOutput;

/**
 * @author lystart
 * @create 2023-02-27 20:23
 */
public class TestMessage {
    public static void main(String[] args) throws Exception {
        Message msg = new Message("韩金龙","茄子","有内鬼终止交易",20232/27);
        File file = new File("day19\\message.dat");
        ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream(file));
        obs.writeObject(msg);
        obs.close();
    }


    //F:\IDEA\java230201\
    @Test
    public void test() throws IOException, ClassNotFoundException {
        File file = new File("F:\\IDEA\\java230201\\day19\\message.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Object mes = ois.readObject();
        ois.close();
        System.out.println(mes);

    }









}
