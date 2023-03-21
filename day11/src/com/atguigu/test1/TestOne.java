package com.atguigu.test1;

public class TestOne {
    public static void main(String[] args) {
        methodOne();
    }

    // 检查方法重写是否符合语法规范
    @Override
    public String toString() {
        return "";
    }

    // 标注方法已过期
    @Deprecated
    public static void methodOne(){
        System.out.println("in methodOne()");
    }
}
