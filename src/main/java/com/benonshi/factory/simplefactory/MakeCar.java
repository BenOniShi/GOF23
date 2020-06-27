package com.benonshi.factory.simplefactory;

/**
 * @author BenOniShi
 * @date 2020/6/27 7:25
 */
public class MakeCar {

    public static void main(String[] args) {
        try {
            Car Tesla = new TeslaFactory().getCar();
            Car Benz = new BenzFactory().getCar();
            Tesla.start();
            Benz.start();
            ((Station) (s) -> System.out.println(s + "正在加油")).petrol(Tesla.name);
            ((Station) (s) -> System.out.println(s + "正在加油")).petrol(Benz.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
