package com.benonshi.factory;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/25 12:05
 **/
public class HuaWeiPhone implements IPhoneProduct {
    @Override
    public void call() {
        System.out.println("手机打电话");
    }
}
