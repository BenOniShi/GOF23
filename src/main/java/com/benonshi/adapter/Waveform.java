package com.benonshi.adapter;

/**
 * @author BenOniShi
 * @date 2020/8/7 1:43
 */
public class Waveform {
    private static  long counter;
    private final  long id = counter++;

    @Override
    public String toString() {
        return "Waveform{" +
                "id=" + id +
                '}';
    }
}
