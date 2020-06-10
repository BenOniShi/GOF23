package com.benonshi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author BenOniShi
 * @date 2020/6/1 22:23
 */
public class StreamOperating {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i <10 ; i++) {
            list.add(i);
        }
        int i;
        boolean b = list.stream().anyMatch(Objects::isNull);
        System.out.println(b);
    }
}
