package com.benonshi.adapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author BenOniShi
 * @date 2020/8/4 1:37
 */
public class Apply {
    /**
     * 这个方法运用到策略模式  方法包含所执行的算法中不变的部分
     * 而策略包含变化的部分 策略就是传递的 Processor 参数对象，包含执行的算法
     *
     * @param processor
     * @param str
     */
    public static void process(Processor processor, Object str) {
        System.out.println(processor.name());
        System.out.println(processor.process(str));
    }

    public static void main(String[] args) {
        process(new UpCase(), "hello");
        process(new DownCase(), "WORD");
        process(new Splitter(), "hello-word");

        Waveform waveform = new Waveform();
        HighPass highPass = new HighPass(1);
        process(new FilterAdapter(highPass), waveform);
        LowPass lowPass = new LowPass(2);
        process(new FilterAdapter(lowPass), waveform);

        double var = 5000000;
        System.out.println(var / 10000);
    }
}
