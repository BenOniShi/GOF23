package com.benonshi.factory;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/25 12:05
 **/
public class ApplePhone implements IPhoneProduct {

    @Override
    public void call() {
        System.out.println("苹果手机打电话");
    }

}
