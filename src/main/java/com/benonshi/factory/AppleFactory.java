package com.benonshi.factory;

/**
 * @Author: BenOnSHI
 * @Date: 2020/4/25 12:07
 **/
public class AppleFactory implements BrandFactory {

    @Override
    public IPhoneProduct getPhone() {
        return new ApplePhone();
    }

    @Override
    public IComputerProduct getComputer() {
        return new HuaWeiComputer();
    }
}
