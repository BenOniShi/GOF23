package com.benonshi.adapter;

/**
 * @author BenOniShi
 * @date 2020/8/4 1:39
 */
public class UpCase extends Processor {
    @Override
    String process(Object input) {
        return String.valueOf(input).toUpperCase();
    }
}
