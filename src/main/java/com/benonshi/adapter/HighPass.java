package com.benonshi.adapter;

/**
 * @author BenOniShi
 * @date 2020/8/7 1:47
 */
public class HighPass extends Filter {
    double count;

    public HighPass(double count) {
        this.count = count;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}
