package com.atguigu.homework;

import java.util.*;
/**
 * @author lystart
 * @create 2023-02-24 18:06
 */
public class Exer1 {
    public static void main(String[] args) {

        List list = new ArrayList();
        String[] count = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] flower = new String[]{"黑桃", "红桃", "梅花", "方块"};
        String[] king = new String[]{"大王", "小王"};

        String[] pu = new String[(count.length * flower.length) + 2];
        for (int i = 0, k = 0; i < flower.length; i++) {
            for (int j = 0; j < count.length; j++, k++) {
                pu[k] = flower[i] + count[j];
                list.add(pu[k]);
            }
        }
        for (int i = 0; i < king.length; i++) {
            list.add(king[i]);
        }

        System.out.println("发牌");
        Collections.shuffle(list);

        List[] newlist = new ArrayList[4];
        for (int i = 0; i < newlist.length; i++) {
            newlist[i] = new ArrayList();
        }

        System.out.println(list);
        for (int i = 0, p = 0; i < list.size(); ) {
            for (int j = 0; j < newlist.length; j++, p++) {
                newlist[j].add(list.get(i++));
            }
            if (newlist[0].size() == 11) {
                break;
            }
        }
        for (int i = 0; i < newlist.length; i++) {
            System.out.println("第" + (i+1) + "个人" + newlist[i]);
        }
        for (int i = 0; i < newlist.length; i++) {
            list.removeAll(newlist[i]);
        }
        System.out.println("剩余牌：" + list);
    }
}
