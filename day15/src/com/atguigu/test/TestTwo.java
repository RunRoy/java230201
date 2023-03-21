package com.atguigu.test;

import java.util.Arrays;

public class TestTwo {
    public static void main(String[] args) {
        // 数组扩容
        int[] nums = {84,76,54,93,61,89};

        int[] nums1 = new int[nums.length*2];

        for (int i = 0; i < nums.length; i++) {
            nums1[i] = nums[i];
        }

        System.out.println(Arrays.toString(nums1));
    }
}
