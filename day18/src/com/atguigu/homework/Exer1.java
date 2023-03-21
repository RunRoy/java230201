package com.atguigu.homework;

import java.util.HashMap;

/**
 * @author lystart
 * @create 2023-02-25 23:01
 */
public class Exer1 {
    public static void main(String[] args) {
        String str = "Your future depends on your dreams, so go to sleep.";
        str = str.replaceAll("[^a-zA-Z]", "");
        // 存储过程中判断是否包含该键（key），如果包字符就作为集合的键且值赋为1，如果集合中包含这个键，值就加1
        // 转为char型字符数组
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        // 去除空格和字符
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }

    }
}
