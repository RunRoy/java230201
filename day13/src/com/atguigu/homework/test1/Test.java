package com.atguigu.homework.test1;

import javax.swing.plaf.metal.MetalIconFactory;
import javax.xml.transform.Source;

/**
 * @author lystart
 * @create 2023-02-18 22:02
 */
public class Test {
    public static void main(String[] args) {
            new Thread(new Runnable() {

                @Override
                public void run() {
                    for (int i = 1; i <= 100 ; i++) {
                        if(i % 2 ==0){
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println(Thread.currentThread().getName() + i);
                        }
                    }
                }
            },"子线程-->").start();

        for (int i = 1; i <= 100 ; i++) {
            if(i % 2 != 0){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + "线程" + i);
            }
        }
    }
}
