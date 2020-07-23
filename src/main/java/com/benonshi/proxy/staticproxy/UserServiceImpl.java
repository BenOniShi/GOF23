package com.benonshi.proxy.staticproxy;

/**
 * @author BenOniShi
 * @date 2020/7/23 22:31
 */
public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("新增用户方法");
    }
}
