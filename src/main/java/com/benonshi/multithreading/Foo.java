package com.benonshi.multithreading;

import java.util.concurrent.Semaphore;

/**
 * @Author: BenOnSHI
 * @Date: 2021/1/7 11:49
 **/
public class Foo {

    Semaphore semaphore1;
    Semaphore semaphore2;

    public Foo() {
        semaphore1 = new Semaphore(0);
        semaphore2 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        semaphore1.release(1);
        // printFirst.run() outputs "first". Do not change or remove this line.
    }

    public void second(Runnable printSecond) throws InterruptedException {
        semaphore1.acquire();
        printSecond.run();
        semaphore2.release();
        // printSecond.run() outputs "second". Do not change or remove this line.
    }

    public void third(Runnable printThird) throws InterruptedException {
        semaphore2.acquire();
        printThird.run();

        // printThird.run() outputs "third". Do not change or remove this line.
    }
}
