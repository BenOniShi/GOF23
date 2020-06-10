package com.benonshi.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author BenOniShi
 * @date 2020/6/8 23:45
 */
public class Visibility {

    volatile boolean state = true;
    int a;

    public void stateRun() {
        System.out.println("start------------------");
        while (state == true) {
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end-------------------");
    }

    public void sum() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1212456465);
        list.forEach(System.out::println);
        list.forEach(String::valueOf);

    }


    public static void main(String[] args) {
        Visibility visibility = new Visibility();
        new Thread(visibility::stateRun).start();

        visibility.state = false;
    }


}
