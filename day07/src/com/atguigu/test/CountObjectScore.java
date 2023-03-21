package com.atguigu.test;

public class CountObjectScore {
    // 在声明方法时定义形参列表，定义形参需要给出形参类型和形参名
    // 多个形参之间用逗号分割，形参的数量没有限制
    // 形参的声明周期和局部变量一样，都是在定义它的方法内部使用
    // 局部变量的值是由方法内部确定的，形参的值是由方法调用时由调用点传入的
    public int countSum(Score score){
        // int sum = 0;
        // sum = score.lang + score.math + score.english;
        // sum = score.getSum();
        // return sum;
        return score.getSum();
    }

    public int countAvg(Score score){
        int avg = 0;
        // avg = (lang + math + english)/3;
        // avg = countSum(score) / 3;
        avg = score.getAvg();
        return avg;
    }
}
