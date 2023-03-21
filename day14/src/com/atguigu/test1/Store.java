package com.atguigu.test1;

// 多个生产者与多个消费者
public class Store {
    private int items = 20;// 库存数量上限为20

    // 生产
    public void add(){
        while(true) {
            synchronized (this) {
                while(items >= 20) {
                    System.out.println("商品库存已达上限，暂停生产先消费~~~~~~~~~~~~~~");
                    try {
                        this.wait();// 锁对象调wait方法，wait会让线程处于阻塞状态
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"生产线程生产了一个商品，当前库存数量为:"+(++items)+"-----------------------------");
                this.notifyAll();// 唤醒所有处于等待的线程
            }
        }
    }

    // 消费
    public void get(){
        while (true){
            synchronized (this){
                while(items <= 0){
                    System.out.println("商品已售罄，暂停消费，先生产~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    try {
                        this.wait();// wait方法释放锁
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                try {
                    Thread.sleep(100);// sleep方法不释放锁
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"消费线程消费了一个商品，当前库存数量为："+(--items)+"-----------------------");
                this.notifyAll();
            }
        }
    }
}
