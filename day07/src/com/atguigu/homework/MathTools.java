package com.atguigu.homework;

import javax.swing.plaf.metal.MetalIconFactory;

/**
 * @author lystart
 * @create 2023-02-10 19:33
 */
public class MathTools {

   public  boolean isEven(int...nums){
       System.out.println("判断0~n个整数是否都是偶数，如果都是偶数，返回true，否则返回false");
       for (int i = 0; i < nums.length; i++) {
           if(nums[i] % 2 != 0){
               return false;
           }
       }
       return true;
   }

   public boolean  isPositive(int... nums) {
       System.out.println("判断0~n个整数是否都是正数，如果都是正数，返回true，否则返回false");
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] <= 0) {
               return false;
           }
       }
           return true;
   }

   public int[] toArray(int...nums){
       int[] arr = new int[nums.length];
       System.out.println("将0~n个整数放到一个int[]数组中，并返回数组");
       for (int i = 0; i < nums.length; i++) {
           arr[i] = nums[i];
       }
       return arr;
   }
}
