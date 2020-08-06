package com.benonshi.adapter;

import java.util.Arrays;

/**
 * @author BenOniShi
 * @date 2020/8/4 1:40
 */
public class Splitter extends AbstractProcessor {
    @Override
    public String process(Object input) {
        String[] split = String.valueOf(input).split("-");
        return Arrays.toString(split);
    }
}
