package com.atguigu.homework;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.Arrays;

/**
 * @author lystart
 * @create 2023-02-22 10:20
 */
public class Exe7 {
    public static void main(String[] args) {
        //
        String str = "1.hello2.world3.java4.string";
        String[] split = str.split("[0-9].");
        System.out.println(Arrays.toString(split));

    }
}
