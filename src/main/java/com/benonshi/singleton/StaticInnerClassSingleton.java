package com.benonshi.singleton;

/**
 * @author BenOniShi
 * @date 2020/4/15 0:59
 */
@SuppressWarnings("all")
public class StaticInnerClassSingleton {
    // 私有的构造方法
    private StaticInnerClassSingleton() {
    }

    // 获取实例变量的静态方法
    public static StaticInnerClassSingleton getInstance() {
        return SingletonHolder.singleton;
    }

    // 静态内部类
    private static class SingletonHolder {
        // 私有的类实例变量
        private static final StaticInnerClassSingleton singleton = new StaticInnerClassSingleton();
    }

}
