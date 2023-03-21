package com.atguigu.test1;

public class TestTwo {
    public static void main(String[] args) {
        // 方法重载发生在同一个类中，方法名相同，参数组不同(参数个数不同，参数类型不同，参数顺序不同)
        methodOne(200);
    }

    public static void methodOne(){
        System.out.println(100);
    }

    public static void methodOne(int one){
        System.out.println(one);
    }

    public static void methodOne(String s){
        System.out.println(s);
    }

    public static void methodOne(int i,String s){
        System.out.println(i+s);
    }

    public static void methodOne(String s,int i){
        System.out.println(s+i);
    }
}
