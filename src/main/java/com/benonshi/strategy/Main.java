package com.benonshi.strategy;

/**
 * @author BenOniShi
 * @date 2020/7/7 22:50
 */
public class Main {

    public static void main(String[] args) {
        Sorter<Dog> sorter = new Sorter<>();
        Dog[] dogs = new Dog[]{new Dog(10), new Dog(7), new Dog(12)};
        sorter.sort(dogs, new DogComparator());
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
