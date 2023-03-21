package com.atguigu.lambda;

import java.util.function.IntBinaryOperator;

/**
 * 包名:com.atguigu.lambda
 *
 * @author Leevi
 * 日期2023-03-03  08:50
 */
public class CalculatorManager {
    /**
     * 执行计算
     * @param a
     * @param b
     * @param intBinaryOperator
     * @return
     */
    public static int invokeCalculate(int a, int b, IntBinaryOperator intBinaryOperator){
        return intBinaryOperator.applyAsInt(a,b);
    }
}
