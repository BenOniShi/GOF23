package com.benonshi.adapter;

/**
 * @author BenOniShi
 * @date 2020/8/4 1:40
 */
class DownCase extends AbstractProcessor {
    @Override
    public String process(Object input) {
        return String.valueOf(input).toLowerCase();
    }
}
