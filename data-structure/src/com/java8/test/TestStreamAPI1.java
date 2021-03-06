package com.java8.test;

import com.java8.entity.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamAPI1 {
    @Test
    public void test1() {

        // 1.通过Collection系列集合提供的stream()方法
        List<Integer> list = new ArrayList<>();
        Stream<Integer> stream1 = list.stream();

        // 2.通过Arrays.stream 方法获取流
        Integer[] integers = new Integer[3];
        Stream<Integer> stream2 = Arrays.stream(integers);

        // 3.通过Stream的静态of方法获取
        Stream<String> stream3 = Stream.of("aa", "bb", "cc", "dd");

        // 4.创建无限流
        // 迭代
        Stream<Integer> stream4 = Stream.iterate(0, (x) -> x + 2);
        stream4.limit(10).forEach(System.out::println);

        // 生成
        Stream.generate(() -> Math.random())
                .limit(10)
                .forEach(System.out::println);
    }

    List<Employee> emps = Arrays.asList(
            new Employee(102, "李四", 59, 6666.66),
            new Employee(101, "张三", 18, 9999.99),
            new Employee(103, "王五", 28, 3333.33),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(104, "赵六", 8, 7777.77),
            new Employee(105, "田七", 38, 5555.55)
    );

    @Test
    public void test2() {
        emps.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
    }

}
