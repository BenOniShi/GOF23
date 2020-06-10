package com.benonshi.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 * @author BenOniShi
 * @date 2020/6/11 2:21
 */
public class ReadAndWriteLock {

    static Lock lock = new ReentrantLock();

    static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    //
    static Lock readLock = readWriteLock.readLock();
    //互斥锁
    static Lock writeLock = readWriteLock.writeLock();


    public static void read(Lock lock) {
        lock.lock();
        try {
            Thread.sleep(2000);
            System.out.println("read over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void write(Lock lock) {
        lock.lock();
        try {
            Thread.sleep(2000);
            System.out.println("write over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            new Thread(() -> {
                read(readLock);
            }).start();
        }
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                write(writeLock);
            }).start();
        }

    }


}
