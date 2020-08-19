package com.benonshi.strategy;

/**
 * @author BenOniShi
 * @date 2020/7/7 21:35
 */
public class Cat implements Comparable<Cat> {
    private int weight;

    public Cat(int weight) {
        this.weight = weight;
    }


    @Override
    public int compareTo(Cat o) {
        if (this.weight < o.weight) return 1;
        else if (this.weight > o.weight) return -1;
        return 0;
    }
}
