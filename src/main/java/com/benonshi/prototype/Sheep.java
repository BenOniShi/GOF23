package com.benonshi.prototype;

import java.io.*;

/**
 * 原型设计模式
 *
 * @author BenOniShi
 * @date 2020/7/8 20:56
 */
public class Sheep implements Cloneable, Serializable {
    private String name;
    private String color;
    private Sheep friend;

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    public Sheep(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Sheep(String name, String color, Sheep friend) {
        this.name = name;
        this.color = color;
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * 浅拷贝实现
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

    /**
     * 深拷贝实现
     * 复制对象得所有基本数据类型的成员变量值
     * 为所有引用数据类型的成员变量申请内存空间，并复制每个引用数据类型成员变量所引用的对象，
     * 直到该对象可达到的所有对象。也就是说，对象进行深拷贝要对整个对象进行拷贝。
     *
     * @return
     * @throws IOException
     */
    public Sheep sheepClone() {
        Sheep sheep = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            // 将当前对象以对象输出流输出到字节数组流中
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            sheep = (Sheep) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                bos.flush();
                oos.flush();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sheep;
    }
}
