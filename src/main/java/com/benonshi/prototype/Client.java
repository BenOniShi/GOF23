package com.benonshi.prototype;

import java.io.IOException;
import java.util.Calendar;


/**
 * @author BenOniShi
 * @date 2020/7/8 20:57
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException {
        Sheep sheep = new Sheep("多莉", "白色");
        sheep.setFriend(new Sheep("哈利", "黑色"));
        Sheep clone = sheep.sheepClone();
        Sheep clone1 = sheep.sheepClone();
        sheep.setFriend(new Sheep("嗨皮", "紫色"));
        Sheep clone2 = sheep.sheepClone();
        Sheep clone3 = sheep.sheepClone();
        System.out.println(clone.getFriend());
        System.out.println(clone1.getFriend());
        System.out.println(clone2.getFriend());
        System.out.println(clone3.getFriend());
    }
}
