package com.benonshi.multithreading;

/**
 * @author BenOniShi
 * @date 2020/9/24 0:54
 */
public class VolatileAtomic {

    private static volatile int num = 0;

    private static void increase() {
        num++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(()->{
                for (int j = 0; j < 1000; j++) {
                    increase();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println(num);
    }



}
