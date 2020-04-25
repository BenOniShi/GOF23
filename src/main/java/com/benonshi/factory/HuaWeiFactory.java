package com.benonshi.factory;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/25 12:08
 **/
public class HuaWeiFactory implements BrandFactory {
    @Override
    public IPhoneProduct getPhone() {
        return new HuaWeiPhone();
    }

    @Override
    public IComputerProduct getComputer() {
        return new HuaWeiComputer();
    }
}
