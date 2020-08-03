package com.benonshi.adapter;

import java.util.Arrays;

/**
 * @author BenOniShi
 * @date 2020/8/4 1:29
 */
public class Processor {
    public String name() {
        return this.getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

