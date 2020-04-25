package com.benonshi.factory;


/**
 * @Author: BenOnSHI
 * @Date: 2020/4/25 11:57
 **/
public interface BrandFactory {

    IPhoneProduct getPhone();

    IComputerProduct getComputer();

}
