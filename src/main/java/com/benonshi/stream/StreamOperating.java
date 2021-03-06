package com.benonshi.stream;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author BenOniShi
 * @date 2020/6/1 22:23
 */
public class StreamOperating {

    public static List<Emp> empList = new ArrayList<>();

    static {
        empList.add(new Emp("人造人1号", 20, 1000.0));
        empList.add(new Emp("人造人2号", 20, 2000.0));
        empList.add(new Emp("人造人3号", 30, 3000.0));
        empList.add(new Emp("人造人4号", 30, 4000.0));
        empList.add(new Emp("人造人5号", 38, 5000.0));
        empList.add(new Emp("人造人6号", 45, 9000.0));
        empList.add(new Emp("人造人7号", 55, 10000.0));
        empList.add(new Emp("人造人8号", 55, 15000.0));
        empList.add(new Emp("人造人9号", 56, 20000.0));
        empList.add(new Emp("人造人10号", 86, 500.0));

    }


    static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static void main(String[] args) {
        // false
        boolean a = empList.stream().mapToInt(Emp::getAge).allMatch(value -> value > 25);
        System.out.println("该集合中所有人的年龄都大于25吗？" + a);
        // true
        boolean b = empList.stream().mapToInt(Emp::getAge).anyMatch(value -> value > 25);
        System.out.println("该集合中有年龄大于25的人吗？" + b);


        List<Emp> collect3 = empList.stream().filter(distinctByKey(Emp::getAge)).sorted(Comparator.comparing(Emp::getAge)).collect(Collectors.toList());
        collect3.forEach(System.out::println);


        // 获取 薪水大于 5000 的员工
        List<Emp> collect = empList.stream().filter(emp -> emp.getSalary() > 5000).collect(Collectors.toList());
        long count = empList.stream().map(Emp::getSalary).filter(x -> x > 5000).count();
        System.out.println("薪水大于5000的员工有"+count+"个");
        collect.forEach(System.out::println);
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(1);
        List<Integer> collect2 = list.stream().distinct().collect(Collectors.toList());
        collect2.forEach(System.out::println);
        System.out.println("--------------");
        Map<Integer, List<Integer>> collect1 = list.stream().collect(Collectors.groupingBy(integer -> integer));
        collect1.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });

    }

    public static class Emp {
        private String name;
        private Integer age;
        private Double salary;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Double getSalary() {
            return salary;
        }

        public void setSalary(Double salary) {
            this.salary = salary;
        }

        public Emp(String name, Integer age, Double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Emp{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}';
        }
    }

}
