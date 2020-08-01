package com.benonshi.template.execution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author BenOniShi
 * @date 2020/7/23 17:33
 */
public abstract class AbstractExecutionTimeTemplate {

    public void template() {
        System.out.println("开始---------");
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("时间是" + (end - start) + "毫秒");
        System.out.println("结束---------");
    }

    protected abstract void code();
}

class A extends AbstractExecutionTimeTemplate {

    @Override
    protected void code() {
        List<Integer> list = new ArrayList<>(1000000);
        for (int i = 0; i < 1000000; i++) {
            list.add(0, i);
        }
    }

    public static void main(String[] args) {
        A a = new A();
        a.template();
    }
}

class B extends AbstractExecutionTimeTemplate {

    @Override
    protected void code() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(0, i);
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.template();
    }
}
