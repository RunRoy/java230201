package com.atguigu.test;

import java.io.IOException;

public class TestTwo {
    public static void main(String[] args) {
        // try-catch结构处理异常
        // try块监控可能出现异常的代码
        // try块监控的代码没有抛出任何异常，执行完try块的所有代码，跳过catch块继续向下
        // try块如果有异常出现，则在出现异常的那行代码停止，抛出异常对象
        // try块会通知catch块抛出异常的种类
        try {
            System.out.println("begin try");
            String s = null;
            // s.toString();
            int x = 5 / 0;
            // Class.forName("");
            System.out.println("end try");
        }catch (NullPointerException ex){// 参数就是该catch块捕获的异常种类
            // catch块负责根据参数的异常种类捕获异常对象
            // try块抛出的异常种类和catch块捕获的异常种类匹配
            // 程序进入catch块执行，catch块执行完毕则继续向下执行程序
            // try块抛出的异常和catch块捕获的异常不匹配，捕获异常对象失败
            // 不会进入catch块，异常对象继续向上抛出
            System.out.println("in catch");
            ex.printStackTrace();
        }catch (ArithmeticException ex){
            // 如果try块中抛出异常种类多，需要分别处理，则可以使用多重catch块
            // catch块的数量不受限制，从第一个catch块开始匹配异常对象
            // 匹配成功进入catch块执行，执行完退出整个try-catch结构，程序继续向下
            // 如果当前catch块匹配不成功，则依次向下匹配下一个catch块
            System.out.println("in second catch");
            ex.printStackTrace();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println("程序结束");
    }
}
