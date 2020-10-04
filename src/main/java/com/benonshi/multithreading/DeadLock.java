package com.benonshi.multithreading;


/**
 * 死锁  两个或多个进程在执行的过程中，因为竞争资源而发生互相等待的现象，若无外力作用，它们都将无法推进下去。
 * @author BenOniShi
 * @date 2020/9/7 14:48
 */
public class DeadLock implements Runnable {

    private boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (DeadLock.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Object.class) {

                }
            }
        } else {
            synchronized (Object.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (DeadLock.class) {

                }
            }
        }
    }


    public static void main(String[] args) {
        new Thread(new DeadLock(true)).start();
        new Thread(new DeadLock(false)).start();
    }


}
