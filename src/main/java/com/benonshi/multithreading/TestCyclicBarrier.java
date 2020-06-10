package com.benonshi.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author BenOniShi
 * @date 2020/6/11 1:00
 */
public class TestCyclicBarrier {
    public static void main(String[] args) {
        /**
         * parties          共同的线程数
         * barrierAction    parties之后执行的方法
         */
        CyclicBarrier cyclicBarrier = new CyclicBarrier(20, () -> System.out.println("人满，发车"));

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }


}
