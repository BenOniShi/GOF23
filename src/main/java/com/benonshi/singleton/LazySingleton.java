package com.benonshi.singleton;

/**
 * @author BenOniShi
 * @date 2020/4/15 0:49
 */
@SuppressWarnings("all")
public class LazySingleton {
    // 私有的属性
    private volatile static LazySingleton lazySingleton = null;

    private String name;

    // 私有的构造方法
    private LazySingleton() {
    }

    // 对外公共的访问方式
    public static LazySingleton getInstance() {
        // 如果 lazySingleton 为空
        if (lazySingleton == null) {
            // 同步锁
            synchronized (LazySingleton.class) {
                // 再进行判断
                if (lazySingleton == null) {
                    // 实例化
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
