package com.benonshi.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author BenOniShi
 * @date 2020/6/10 17:44
 */
public class CountAdd {

    static final LongAdder longAdder = new LongAdder();
    private Lock lock = new ReentrantLock();

    private volatile static int count = 0;

    public  void add() {
        lock.lock();
        try {
            for (int i = 0; i < 10000; i++) {
                longAdder.increment();
                count++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        CountAdd countAdd = new CountAdd();

        List<Thread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(countAdd::add);
            threadList.add(thread);
        }
        threadList.forEach(Thread::start);
        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(count);
        System.out.println(longAdder.sum());
    }


}
