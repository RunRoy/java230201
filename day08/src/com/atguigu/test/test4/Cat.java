package com.atguigu.test.test4;

public class Cat extends Pet {
    // 检查方法重写是否符合语法规范的注解
    @Override
    public Pet play() {
        System.out.println("玩儿毛线球");
        return null;
    }

//    @Override
//    public Pet play(int i){
//        System.out.println("11111111111111111111");
//        return null;
//    }
}
