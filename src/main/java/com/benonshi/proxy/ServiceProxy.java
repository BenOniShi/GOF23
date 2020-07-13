package com.benonshi.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author BenOniShi
 * @date 2020/4/26 21:27
 */
public class ServiceProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object obj) {
        this.target = obj;
        return Proxy.newProxyInstance(
                obj.getClass().getClassLoader()
                , obj.getClass().getInterfaces()
                , this);
    }


    public boolean connect() {
        System.out.println("【代理对象】数据库连接建立了");
        return true;
    }

    public void close() {
        System.out.println("【代理对象】数据库连接关闭了");
    }

    public void transaction() {
        System.out.println("【代理对象】数据库事务控制");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object returnValue = null;
        if (this.connect()) {
            Class<?>[] interfaces = proxy.getClass().getInterfaces();
            for (Class<?> anInterface : interfaces) {
                System.out.println(anInterface.getSimpleName());
            }
            returnValue = method.invoke(this.target, args);
            this.transaction();
            this.close();
        }
        return returnValue;
    }
}
