package com.atguigu.homework;

import javafx.scene.shape.Circle;

/**
 * @author lystart
 * @create 2023-02-10 20:51
 */
public class PassParamDemo {

    /**
     * 将num变为原来的2倍大
     * @param num
     */
   public void  doubleNumber(int num){
       num *= 2;
   }

    /**
     * 将letter的小写字母转为大写字母
     * @param letter
     */
   public void toUpperCase(char letter){
        letter -= 32;
   }

    /**
     * 将Circle的c对象的半径扩大为原来的times被。圆Circle类包含radius属性
     * @param c
     * @param times
     */
   public  void expandCircle(Circle c, float times){
        c.setRadius(c.getRadius() * times);
    }

    /**
     * 把arr数组的元素扩大2倍
     * @param arr
     */
    public  void doubleElement(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }

    /**
     * 将arr数组的长度变为原来的1.5倍
     * @param arr
     */
    public void grow(int[] arr){
//        int num = arr.length * 3 / 2;
        arr = new int[arr.length * 3 / 2];
    }

}
