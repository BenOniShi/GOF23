package com.benonshi.adapter;

import java.util.Arrays;

/**
 * @author BenOniShi
 * @date 2020/8/4 1:29
 */
public interface Processor {
    public String name();

    public Object process(Object input);
}

