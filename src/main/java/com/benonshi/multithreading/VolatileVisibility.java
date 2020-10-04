package com.benonshi.multithreading;

/**
 * @author BenOniShi
 * @date 2020/9/23 16:51
 */
public class VolatileVisibility {

    private  static volatile boolean initFlag = false;

    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("waiting dada...");
            while (!initFlag) {

            }
            System.out.println("--------success!");
        }).start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(VolatileVisibility::prepareData).start();
    }

    private static void prepareData() {
        System.out.println("prepareData ------------");
        initFlag = true;
    }
}
