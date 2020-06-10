package com.benonshi;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.HashSet;
import java.util.Set;

/**
 * @author BenOniShi
 * @date 2020/5/8 2:19
 */
@RunWith(JUnit4.class)
public class Test {

    @org.junit.Test
    public void test() {
        Set set = new HashSet();
        set.toArray(new String[]{});
    }

}
