package com.benonshi.multithreading;

import java.util.concurrent.CountDownLatch;

/**
 * @author BenOniShi
 * @date 2020/9/29 20:22
 */
public class TestCountDownLatch {
    private volatile static int count = 0;
    Thread[] threads = new Thread[100];
    private CountDownLatch latch = new CountDownLatch(threads.length);

    public void add() {
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                synchronized (this) {
                    for (int j = 0; j < 10000; j++) {
                        count++;
                    }
                }
                latch.countDown();
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }

    public static void main(String[] args)   {
        TestCountDownLatch threadCountAdd = new TestCountDownLatch();
        threadCountAdd.add();
        try {
            threadCountAdd.latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
    }
}
