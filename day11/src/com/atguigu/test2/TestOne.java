package com.atguigu.test2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestOne {
    private int[] nums;

    // void返回且没有参数的方法
    @Test
    public void test(){
        System.out.println("in test()");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void test1(){
        System.out.println("in test1()");
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }

    @Test
    public void test2(){
        System.out.println("in test2()");
    }

    @Before
    public void before(){// 在测试方法运行前运行
        System.out.println("in before()");
        nums = new int[]{76,95,83,69,72};
    }

    @After
    public void after(){// 在测试方法运行后运行
        System.out.println("in after()");
    }

}
