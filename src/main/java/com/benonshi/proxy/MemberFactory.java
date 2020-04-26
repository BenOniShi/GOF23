package com.benonshi.proxy;

/**
 * @author BenOniShi
 * @date 2020/4/26 21:26
 */
public class MemberFactory {
    private MemberFactory() {

    }

    public static IMemberService getInstance() {
        return (IMemberService) new ServiceProxy().bind(new MemberServiceImpl());
    }
}
