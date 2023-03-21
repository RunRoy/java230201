package com.atguigu.test2;

public interface MyInterOne {
    public void methodTwo();
    // 从JDK1.8开始接口中允许出现带有方法体的方法
    // default修饰的方法，不强制实现类必须重写，但是如果实现类重写了也是可以的
    // default修饰的方法想要运行则必须创建实现类对象，由实现类对象调用方法
    // 如果实现类没有重写default方法则运行的是接口中的方法，如果实现类重写了default方法，则运行的是实现类重写之后的
    public default void methodOne(){
        System.out.println("in MyInterOne methodOne()");
    }

    // 从jdk1.8开始允许接口中的方法由static修饰
    // static修饰的方法由接口名直接调用，无需创建对象
    // 接口中的static方法不允许使用对象调用
    public static void methodThree(){
        System.out.println("in MyInterOne static methodThree()");
    }
}
