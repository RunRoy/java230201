package com.atguigu.test1;

// Dog extends Pet Dog类继承自Pet类，Dog是子类Pet是父类
// 子类可以继承父类的所有属性和方法，构造方法不能继承
// Java语言规定一个类只能有一个直接父类，只能继承自一个类
// Java语言支持多层次继承，一个类的直接父类也可以继承父类
// 一个类如果有显示的继承，则显示继承自父类，如果没有显示的继承则默认继承自Object
public class Dog extends Pet{

    public void work(){
        System.out.println("工作");
    }
}
