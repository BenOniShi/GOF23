package com.benonshi.adapter;

/**
 * @author BenOniShi
 * @date 2020/8/7 1:44
 */
public class Filter {
    public String name() {
        return this.getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
