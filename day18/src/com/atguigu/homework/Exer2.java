package com.atguigu.homework;

import com.oracle.webservices.internal.api.EnvelopeStyle;
import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;

import java.util.*;

/**
 * @author lystart
 * @create 2023-02-26 12:11
 */
public class Exer2 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        ArrayList<String> zjl = new ArrayList<>();
        zjl.add("晴天");
        zjl.add("青花瓷");
        zjl.add("七里香");
        zjl.add("倒影");
        zjl.add("一路向北");
        map.put("周杰伦",zjl);
//        System.out.println(map);
        ArrayList<String> xzq = new ArrayList<>();
        xzq.add("天外来物");
        xzq.add("丑八怪");
        xzq.add("一半");
        xzq.add("变废为宝");
        xzq.add("天后");
        map.put("薛之谦",xzq);
//        System.out.print(map);

        Set<Map.Entry<String, ArrayList<String>>> entries = map.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entries) {
            System.out.println(entry);
        }
    }
}
