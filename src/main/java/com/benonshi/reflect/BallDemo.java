package com.benonshi.reflect;

import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author BenOniShi
 * @date 2020/4/21 1:32
 */
public class BallDemo {
    private String brand;

    private Integer price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @SneakyThrows
    public static void main(String[] args) {
        Class<?> clazz = Ball.class;
        Method[] methods = clazz.getMethods();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println("declaredMethods = " + declaredMethods.length);
        for (int i = 0; i < declaredMethods.length; i++) {
            System.out.println("declaredMethods = " + declaredMethods[i].getName());
        }
        for (int i = 0; i < methods.length; i++) {
            System.out.print(Modifier.toString(methods[i].getModifiers()) + " ");
            System.out.print(methods[i].getReturnType().getSimpleName() + "  ");
            System.out.print(methods[i].getName() + "( ");
            Class<?>[] parameterTypes = methods[i].getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.print(parameterTypes[j].getSimpleName() + " arg-" + j);
                if (j < parameterTypes.length - 1) {
                    System.out.print(" , ");
                }
            }
            System.out.print(")");
            Class<?>[] exceptionTypes = methods[i].getExceptionTypes();
            if (exceptionTypes.length > 0) {
                System.out.print(" throws ");
                for (int j = 0; j < exceptionTypes.length; j++) {
                    System.out.print(exceptionTypes[j].getSimpleName() + " ");
                    if (j < exceptionTypes.length - 1) {
                        System.out.print(" , ");
                    }
                }
            }
            System.out.println();
        }

        Object o = clazz.getDeclaredConstructor().newInstance();
        Field brand = clazz.getDeclaredField("brand");
        System.out.println("brand.getType() = " + brand.getType());
        brand.setAccessible(true);
        brand.set(o, "adidas");
        Object o1 = brand.get(o);
        System.out.println("o1 = " + o1);
    }
}

class Ball {
    private String brand;
    private String price;
}

