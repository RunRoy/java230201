package com.atguigu.homework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lystart
 * @create 2023-02-23 17:50
 */
public class Test1 {
    public static void main(String[] args) {
        // 生成随机验证码
        // 验证码由大小写，数字字符组成
        List letterList = new ArrayList();
        List list = new ArrayList();

        // 把26个大小写字母，数字0-9保存到一个ArrayList集合letterList中
        for (int i = 1; i < 26; i++) {
            letterList.add((char) (96 + i));
            char c = (char) (96 + i);
            String s = String.valueOf(c);
            letterList.add(s.toUpperCase());
        }
        for (int i = 0; i <= 9; i++) {
            letterList.add(i);
        }


        // 随机生成十组六位字符组成的验证码
        for (int j = 1; j <= 10; j++) {
            String s = "";
            for (int i = 0; i < 6; i++) {
                double random = Math.random() * (letterList.size());
                s += letterList.get((int) random);
            }
            list.add("随机验证码：" + s);
        }

        // 用iterator迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
