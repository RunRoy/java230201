package com.atguigu.homework;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lystart
 * @create 2023-02-22 9:49
 */
public class Exe6 {
    public static void main(String[] args) {
//        String str = "sduidbcuiaisyduguebduqwoiqdiobsaocioassichasd";
//        // a-z 26个字母
//        int[] count = new int[26];
//        // 转为char型数组
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            count[chars[i] - 97]++;
//        }
//        // 找出出现次数最多的字母值
//        int max = count[0];
//        for (int i = 1; i < count.length; i++) {
//            if (max < count[i]) {
//                max = count[i];
//            }
//        }
//        // 找出所有出现次数最多的字母
//        for (int i = 0; i < count.length; i++) {
//            if (count[i] == max) {
//                System.out.println((char) (i + 97));
//            }
//        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        String str = "sduidbcuiaisyduguebduqwoiqdiobsaocioassichasd";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println("出现次数最多的字母及次数为：");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count == maxCount) {
                System.out.println(entry.getKey() + ":" + count);
            }
        }
    }
}
