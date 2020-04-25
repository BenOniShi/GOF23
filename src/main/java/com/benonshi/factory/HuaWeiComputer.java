package com.benonshi.factory;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/25 12:36
 **/
public class HuaWeiComputer implements IComputerProduct {
    @Override
    public void send() {
        System.out.println( "华为电脑发邮件");
    }
}
