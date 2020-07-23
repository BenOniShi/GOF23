package com.benonshi.proxy.staticproxy;

/**
 * @author BenOniShi
 * @date 2020/7/23 22:34
 */
public class Client {
    public static void main(String[] args) {
        UserServiceProxyImpl userServiceProxy = new UserServiceProxyImpl(new UserServiceImpl());
        userServiceProxy.proxy();
    }
}
