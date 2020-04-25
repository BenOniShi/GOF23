package com.benonshi.factory;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/25 12:30
 **/
public class AppleComputer implements IComputerProduct {


    @Override
    public void send() {
        System.out.println("苹果电脑发邮件");
    }
}
