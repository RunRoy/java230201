package com.atguigu.test2;

import com.atguigu.test1.Father;

public class Son extends Father {
    public void methodOne(){
        System.out.println(this.four);
        // System.out.println(this.one);
        // System.out.println(this.two);
        // protected修饰的成员在非本包的子类类体中是可以调用的
        // 但是非本包的子类创建出对象后却不能调用
        System.out.println(this.three);
    }
}
