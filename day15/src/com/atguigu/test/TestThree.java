package com.atguigu.test;

import java.util.Arrays;

public class TestThree {
    public static void main(String[] args) {
        // 删除指定下标处元素
        int[] nums = {84,76,54,93,61,89,0,0};

        int index = -16;// 删除元素索引
        int emptyIndex = -1;// 第一个空位索引

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                emptyIndex = i;
                break;
            }
        }

        if(emptyIndex == -1){
            // 扩容
        }else{
            if(index <= 0){
                System.out.println("请输入正确的删除元素下标");
            }else {
                // 删除
                for (int i = index; i < emptyIndex; i++) {
                    nums[i] = nums[i + 1];
                }
                System.out.println(Arrays.toString(nums));
            }
        }
    }
}
