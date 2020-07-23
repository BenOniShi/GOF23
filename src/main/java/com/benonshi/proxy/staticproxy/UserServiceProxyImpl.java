package com.benonshi.proxy.staticproxy;

/**
 * @author BenOniShi
 * @date 2020/7/23 22:32
 */
public class UserServiceProxyImpl implements IUserService {


    private UserServiceImpl userService;

    public UserServiceProxyImpl(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        userService.add();
    }


    public void proxy() {
        System.out.println("代理开始");
        add();
        System.out.println("代理结束");
    }


}
