package com.benonshi.singleton;

/**
 * @author BenOniShi
 * @date 2020/4/15 0:45
 */
@SuppressWarnings("all")
public class EagerSingleton {
    // 私有的静态实例变量
    private static final EagerSingleton eager = new EagerSingleton();

    // 私有的构造方法
    private EagerSingleton() {
    }

    //对外提供公共的访问方式
    public static EagerSingleton getInstance() {
        return eager;
    }

    @Override
    public String toString() {
        return "EagerSingleton{}被加载了";
    }

}
