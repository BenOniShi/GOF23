package com.benonshi.factory;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/25 12:19
 **/
public class PhoneTest {


    public static void main(String[] args) {

        AppleFactory appleFactory = new AppleFactory();
        appleFactory.getPhone().call();
        appleFactory.getComputer().send();

        HuaWeiFactory huaWeiFactory = new HuaWeiFactory();
        huaWeiFactory.getPhone().call();
        huaWeiFactory.getComputer().send();


    }
}
