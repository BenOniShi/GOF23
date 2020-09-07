package com.benonshi.strategy.demo;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: BenOnSHI
 * @Date: 2020/7/31 12:34
 **/
public class Payment implements Comparator {

    public static void main(String[] args) {
        Payment payment = new Payment();
        int comparator = payment.getPriceSum(6);
        System.out.println(comparator);
    }

    @Override
    public int getPriceSum(int count) {
        int priceSum = 0;
        //获取所有档数以及对应价格
        OrderPrice[] values = OrderPrice.values();
        List<OrderPrice> orderPrices = Arrays.asList(values);
        List<OrderPrice> collect = orderPrices
                .stream()
                .sorted(java.util.Comparator.comparing(OrderPrice::getCount))
                .collect(Collectors.toList());
        // 循环开干
        for (int i = 0; i < collect.size(); i++) {
            if (collect.get(i).getCount() < count) {
                priceSum += collect.get(i).getPrice() * collect.get(i).getCount();
            } else {
                priceSum += (count - collect.get(i - 1).getCount()) * collect.get(i).getPrice();
                break;
            }
        }
        return priceSum;
    }


}
