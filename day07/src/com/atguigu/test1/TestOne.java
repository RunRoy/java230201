package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) {
        int[] nums = {74,98,84,63,55};
        methodOne(nums);

        // 调用带有变长参数组方法时，变长参数组可以传参也可以不传参
        // 传参是可以传入任意多个实参，多个实参用逗号分割
        methodTwo("hello",20.5,10,20,30,40);
    }

    public static void methodOne(int[] nums){
        // 传入若干数据，相加求和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("总和是："+sum);
    }

    // 从jdk1.5开始允许形参使用变长参数组
    // 一个方法的形参列表中只允许有一个变长参数组
    // 变长参数组可以和普通参数一起使用，但是变长参数组必须在最后一个
    public static void methodTwo(String s,double d,int... nums){
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

            
        }
    }
}
