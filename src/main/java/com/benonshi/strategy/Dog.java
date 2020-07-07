package com.benonshi.strategy;


/**
 * @author BenOniShi
 * @date 2020/7/7 21:35
 */
public class Dog implements Comparable<Dog>{
    public int weight;

    public Dog(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Dog o) {
        if (this.weight < o.weight) return -1;
        else if (this.weight > o.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }
}
