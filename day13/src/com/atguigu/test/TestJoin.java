package com.atguigu.test;

public class TestJoin {
    public static void main(String[] args) {
        MyThreadThree myThreadThree = new MyThreadThree();
        MyThreadFour myThreadFour = new MyThreadFour(myThreadThree);
        myThreadThree.start();
        myThreadFour.start();
    }
}

class MyThreadThree extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }
}

class MyThreadFour extends Thread{
    private MyThreadThree myThreadThree;
    public MyThreadFour(MyThreadThree myThreadThree){
        this.myThreadThree = myThreadThree;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i+"--------------------------------------");
            if(i == 50){
                try {
                    myThreadThree.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
