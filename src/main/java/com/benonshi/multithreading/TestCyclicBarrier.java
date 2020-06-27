package com.benonshi.multithreading;

import java.util.ArrayList;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author BenOniShi
 * @date 2020/6/11 1:00
 */
public class TestCyclicBarrier {
    public static void main(String[] args) {
        /**
         * 线程计数器         如果当前执行的线程未到达指定的数量 则等待  到达指定的数量后  执行方法体中的代码
         * parties          共同的线程数
         * barrierAction    parties之后执行的方法   Runnable类型
         *
         * barrier 翻译 障碍  界限
         * action  翻译 执行
         * 综合理解 障碍消除之后执行
         */
        CyclicBarrier cyclicBarrierWait = new CyclicBarrier(20, () -> System.out.println("人满，发车"));


        CyclicBarrier cyclicBarrierWaitSecond = new CyclicBarrier(20, () -> System.out.println("不等了开车了"));

        /**
         * await() 方法 如果不达到指定的屏障  会一直等待
         */
        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                try {
                    cyclicBarrierWait.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        /**
         * await(long timeout, TimeUnit unit) 方法  如果在设定的时间内没有达到，将会打破屏障，执行方法
         * timeout timeout the time to wait for the barrier  超时等待的时间
         * unit the time unit of the timeout parameter   时间单位
         */
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    cyclicBarrierWaitSecond.await(1, TimeUnit.SECONDS);
                } catch (InterruptedException | BrokenBarrierException | TimeoutException e) {
                }
            }).start();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(cyclicBarrierWaitSecond.isBroken());
    }


}
