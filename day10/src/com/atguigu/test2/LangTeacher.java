package com.atguigu.test2;

import java.io.Serializable;

// 实现类实现接口时不会影响其集成的机会
// Java语言的类是单继承多实现的。只能继承自一个父类，但可以实现任意多个接口
// 一个实现类实现多个接口后，任何一个它实现的接口需要对象，都可以传递当前类的对象
public class LangTeacher extends Object implements Teacher,Person,Comparable, Serializable {
    @Override
    public void jingKe() {
        System.out.println("讲语文课");
    }

    @Override
    public void sayHello() {
        System.out.println("你好，我是一名老师");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
