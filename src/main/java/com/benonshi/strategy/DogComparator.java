package com.benonshi.strategy;

/**
 * @author BenOniShi
 * @date 2020/7/7 22:35
 */
public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
//        if (o1.weight > o2.weight) return 1;
//        else return 0;
        return o1.compareTo(o2);
    }
}
