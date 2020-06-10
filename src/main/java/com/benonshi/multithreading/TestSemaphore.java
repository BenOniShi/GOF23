package com.benonshi.multithreading;

import java.util.concurrent.Semaphore;

/**
 * Semaphore : 信号灯
 *
 * @author BenOniShi
 * @date 2020/6/11 2:51
 */
public class TestSemaphore {

    public static void main(String[] args) {
        //semaphore 来控制同时执行的线程数   parties 控制可执行的线程数
        Semaphore semaphore = new Semaphore(1);

        new Thread(() -> {
            try {
                // 获取 可执行的数量  parties
                semaphore.acquire();
                System.out.println("T1 running--");
                Thread.sleep(200);
                System.out.println("T1 running--");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                // release 释放
                semaphore.release();
            }
        }).start();


        new Thread(() -> {
            try {
                semaphore.acquire();
                System.out.println("T2 running--");
                Thread.sleep(200);
                System.out.println("T2 running--");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
            }
        }).start();
    }
}
