package com.atguigu.homework.test2;

import java.nio.file.FileAlreadyExistsException;
import java.util.concurrent.locks.Lock;

/**
 * @author lystart
 * @create 2023-02-18 22:44
 */
public class Number {
    int num = 1;
    boolean ood = true;

    public  synchronized void printOddNum() {
        if (ood == true) {
            System.out.println(Thread.currentThread().getName() + ":" + num++);
        }
        ood = false;
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void printEvenNum() {

        if (ood == false) {
            System.out.println(Thread.currentThread().getName() + "：" + num++);
            ood = true;
        }
        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isOod() {
        return ood;
    }

    public void setOod(boolean ood) {
        this.ood = ood;
    }
}
