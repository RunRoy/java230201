package com.atguigu.homework.test3;


import org.junit.Test;
import sun.awt.SunHints;

import javax.swing.plaf.metal.MetalIconFactory;

/**
 * @author lystart
 * @create 2023-02-15 19:11
 */
public class ColorTest {
    public static void main(String[] args) {
       Color[] color = Color.values();
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i].toString());
        }
    }
}