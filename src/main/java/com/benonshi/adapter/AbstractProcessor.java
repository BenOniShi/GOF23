package com.benonshi.adapter;

/**
 * @author BenOniShi
 * @date 2020/8/7 1:51
 */
public abstract class AbstractProcessor implements Processor {
    @Override
    public String name() {
        return this.getClass().getSimpleName();
    }
}
