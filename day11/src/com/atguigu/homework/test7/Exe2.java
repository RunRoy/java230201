package com.atguigu.homework.test7;

/**
 * @author lystart
 * @create 2023-02-15 18:27
 */
public class Exe2 {
    public static void main(String[] args) {

        new Thread("我"){
            @Override
            public void run() {
                System.out.println(getName() + "爱尚硅谷");
            }
        }.run();

        Thread thread = new Thread();
        thread.start();

        new Runnable(){
            @Override
            public void run() {
                System.out.println("尚硅谷爱我");
            }
        }.run();

    }
}
