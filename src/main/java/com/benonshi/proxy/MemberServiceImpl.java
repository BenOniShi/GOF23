package com.benonshi.proxy;

/**
 * @author BenOniShi
 * @date 2020/4/26 21:25
 */
public class MemberServiceImpl implements IMemberService {
    @Override
    public void add() {
        System.out.println("【业务对象】数据库调用add方法");
    }

    @Override
    public int delete() {
        return 0;
    }
}
