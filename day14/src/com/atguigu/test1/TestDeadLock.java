package com.atguigu.test1;


public class TestDeadLock {
    public static void main(String[] args) {
        Owner owner = new Owner();
        LockSmith lockSmith = new LockSmith();
        DeadLockThread dead1 = new DeadLockThread(lockSmith,owner,true);
        DeadLockThread dead2 = new DeadLockThread(lockSmith,owner,false);
        dead1.start();
        dead2.start();
    }
}

class Owner{
    public void say(){
        System.out.println("你给我开门，我给你看房本");
    }

    public void work(){
        System.out.println("给锁匠看房本");
    }
}

class LockSmith{
    public void say(){
        System.out.println("你给我看房本，我给你开门");
    }

    public void work(){
        System.out.println("给业主开门");
    }
}

class DeadLockThread extends Thread{
    private LockSmith lockSmith;
    private Owner owner;
    private boolean flag;

    public DeadLockThread(LockSmith lockSmith, Owner owner, boolean flag) {
        this.lockSmith = lockSmith;
        this.owner = owner;
        this.flag = flag;
    }

    @Override
    public void run() {
        while(true){
            if(flag){// 锁匠线程
                synchronized (lockSmith) {
                    lockSmith.say();
                    synchronized (owner){
                        lockSmith.work();
                    }
                }
            }else{// 业主线程
                synchronized (owner){
                    owner.say();
                    synchronized (lockSmith){
                        owner.work();
                    }
                }
            }
        }
    }
}

