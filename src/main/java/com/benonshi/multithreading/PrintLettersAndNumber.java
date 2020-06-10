package com.benonshi.multithreading;

import lombok.SneakyThrows;

import java.util.ArrayList;

/**
 * @author BenOniShi
 * @date 2020/5/9 2:07
 */
public class PrintLettersAndNumber {

    public static void main(String[] args) {
        Share share = new Share();
        Letters letters = new Letters(share);
        Number number = new Number(share
        );
        Thread lettersThread = new Thread(letters);
        Thread numberThread = new Thread(number);
        lettersThread.start();
        numberThread.start();

    }


}

class Letters implements Runnable {

    private Share share;

    public Letters(Share share) {
        this.share = share;
    }

    @SneakyThrows
    @Override
    public void run() {

        for (int i = 0; i < 52; i++) {
            synchronized (share) {
                if (0 == i % 2) {
                    share.notifyAll();
                    share.wait();
                }
            }
            System.out.print(i + " ");
            share.x = 1;
        }

    }
}

class Number implements Runnable {

    private Share share;

    public Number(Share share) {
        this.share = share;
    }

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");
            synchronized (share) {
                share.notifyAll();
                share.wait();
            }
        }
    }
}

class Share {
    public volatile int x = 0;
}