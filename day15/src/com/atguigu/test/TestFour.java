package com.atguigu.test;

import java.util.Arrays;

public class TestFour {
    public static void main(String[] args) {
        // 指定下标新增元素
        int[] nums = {84,76,54,93,61,0,0,0};
        int index = 5;// 新增元素位置
        int emptyIndex = -1;// 第一个空位下标
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                emptyIndex = i;
                break;
            }
        }
        if(emptyIndex == -1){
            // 扩容
        }else{
            if(index >= 0 && index <= emptyIndex) {
                for (int i = emptyIndex; i > index; i--) {
                    nums[i] = nums[i - 1];
                }
                nums[index] = 89;
                System.out.println(Arrays.toString(nums));
            }else{
                System.out.println("请输入合法的新增下标");
            }
        }
    }
}
