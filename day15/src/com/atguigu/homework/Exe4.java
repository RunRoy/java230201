package com.atguigu.homework;

import javax.swing.plaf.metal.MetalIconFactory;
import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * @author lystart
 * @create 2023-02-21 20:52
 */
public class Exe4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"999999999","4444", "55555", "666666", "7777777", "88888888"};

        System.out.println("原字符串：");
        System.out.println(Arrays.toString(arr));
        int index = 0;
        int length = arr.length;
        while (index < length) {
            if (arr[index].length() > 5) {
                //             ①源数组  ②源数组要复制的起始位置 ③目的数组 ④目的的数组防止的起始位置 ⑤复制的长度
                System.arraycopy(arr, index + 1, arr, index, arr.length - index - 1);
                length--;
            }else {
                index++;
            }
        }
        System.out.println("删除后：");
       arr =  Arrays.copyOf(arr,length);
        System.out.println(Arrays.toString(arr));
    }
}
