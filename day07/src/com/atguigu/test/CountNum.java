package com.atguigu.test;

public class CountNum {
    public int one;
    public int two;
    public String opt;

    // 一个方法规定了返回类型则必须在方法结束时给出一个该类型的数值
    // 方法返回会返回到方法的调用点，如果方法有返回值，则返回值也是返回到方法的调用点
    public int count(){
        int result = 0;
        if(opt.equals("+")){
            return one + two;
        }else if(opt.equals("-")){
            result = one - two;
        }else if(opt.equals("*")){
            result = one * two;
        }else if(opt.equals("/")){
            result = one / two;
        }
        return result;// return关键字的作用是带有返回值的方法返回返回值时使用
    }

    public void methodOne(){

    }
}
