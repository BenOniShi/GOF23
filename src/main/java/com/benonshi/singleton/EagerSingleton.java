package com.benonshi.singleton;

import lombok.SneakyThrows;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author BenOniShi
 * @date 2020/4/15 0:45
 */
@SuppressWarnings("all")
public class EagerSingleton {
    private int val = 100;
    // 私有的静态实例变量
    private static final EagerSingleton eager = new EagerSingleton();

    // 私有的构造方法
    private EagerSingleton() {
        System.out.println("EagerSingleton被初始化了");
    }

    public EagerSingleton(int val) {
        this.val = val;
    }

    //对外提供公共的访问方式
    public static EagerSingleton getInstance() {
        return eager;
    }


}
