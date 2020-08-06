package com.benonshi.adapter;

/**
 * @author BenOniShi
 * @date 2020/8/7 1:45
 */
public class LowPass extends Filter {
    double count;

    public LowPass(double count) {
        this.count = count;
    }

    @Override
    public Waveform process(Waveform input) {
        //Dummy processing
        return input;
    }
}
