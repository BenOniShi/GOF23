package com.benonshi.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author BenOniShi
 * @date 2020/11/23 16:16
 */
public class PersonStream {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 20, "male", "New York"));
        personList.add(new Person("Jack", 7000, 21, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 25, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 30, "female", "New York"));
        personList.add(new Person("Owen", 9500, 30, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 32, "female", "New York"));

        //从员工集合中筛选出salary大于8000的员工，并放置到新的集合里。
        List<Person> collect = personList.stream().filter(person -> person.getSalary() > 8000).collect(Collectors.toList());
        //统计员工的最高薪资、平均薪资、薪资之和。
        Person maxSalaryPerson1 = personList.stream().max((o1, o2) -> o1.getSalary() > o2.getSalary() ? 1 : -1).get();
        Person maxSalaryPerson2 = personList.stream().max(Comparator.comparingInt(Person::getSalary)).get();
        Integer maxSalary = personList.stream().map(Person::getSalary).max(Integer::compareTo).get();
        System.out.println("最高薪资 = " + maxSalaryPerson1.getSalary());
        System.out.println("最高薪资 = " + maxSalaryPerson2.getSalary());
        System.out.println("最高薪资 = " + maxSalary);
        Integer avgSalary = personList.stream().map(Person::getSalary).collect(Collectors.averagingInt(Integer::intValue)).intValue();
        System.out.println("平均薪资 = " + avgSalary);
        Integer sumSalary = personList.stream().mapToInt(Person::getSalary).sum();
        int asInt = personList.stream().mapToInt(Person::getSalary).reduce(Integer::sum).getAsInt();
        System.out.println("薪资之和 = " + sumSalary);
        System.out.println("薪资之和 = " + asInt);
        //

        //将员工按薪资从高到低排序，同样薪资者年龄小者在前。
        List<Person> collect1 = personList.stream().sorted((o1, o2) -> o1.getSalary() > o2.getSalary() ? 1 : -1).collect(Collectors.toList());
        collect1.forEach(System.out::print);

        //将员工按性别分类，将员工按性别和地区分类，将员工按薪资是否高于8000分为两部分。
        Map<String, List<Person>> groupBySex = personList.stream().collect(Collectors.groupingBy(Person::getSex));
        Map<String, List<Person>> groupByArea = personList.stream().collect(Collectors.groupingBy(Person::getArea));


    }


}


class Person {
    private String name;  // 姓名
    private int salary; // 薪资
    private int age; // 年龄
    private String sex; //性别
    private String area;  // 地区

    public Person(String name, int salary, int age, String sex, String area) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}