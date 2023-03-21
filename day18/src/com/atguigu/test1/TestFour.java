package com.atguigu.test1;

public class TestFour {
    public static void main(String[] args) {
        String s = methodOne("Tom");
        Integer s1 = methodOne(new Integer(100));
    }

    // 泛型的方法就是类不泛型，但方法泛型，且泛型的方法必须是静态方法
    public static<T> T methodOne(T t){
        System.out.println(t.getClass().getName());
        return null;
    }
}
