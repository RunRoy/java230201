package com.atguigu.test;

import java.util.Arrays;

public class TestOne {
    public static void main(String[] args) {
        // Arrays的常用方法
        int[] nums = {84,76,54,93,61,89};

        Arrays.sort(nums);// 全部数组元素升序排列
        // Arrays.sort(nums,1,5);// fromIndex的元素到toIndex的前一位的元素进行升序排列
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        int index = Arrays.binarySearch(nums,54);// 二分查找法
        System.out.println(index);

        int[] nums1 = Arrays.copyOf(nums,nums.length*2);// 数组扩容
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = Arrays.copyOfRange(nums,1,4);// 从from到to的前一位截取数组元素
        System.out.println(Arrays.toString(nums2));

        System.out.println(Arrays.toString(nums));
        Arrays.fill(nums,0);// 使用第二个参数将数组的元素填满
        System.out.println(Arrays.toString(nums));



    }
}
