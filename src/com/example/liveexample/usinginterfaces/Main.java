package com.example.liveexample.usinginterfaces;

import com.example.liveexample.Apple;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Apple> apples = Arrays.asList(
                new Apple(new BigDecimal(10.2), "red"),
                new Apple(new BigDecimal(11.2), "red"),
                new Apple(new BigDecimal(12.2), "red"),
                new Apple(new BigDecimal(13.2), "green"),
                new Apple(new BigDecimal(10.5), "red"),
                new Apple(new BigDecimal(12.2), "green")
        );

//        System.out.println(getRedApples(apples));
//        System.out.println(filterApples(apples, new GreenAppleFilter()));

        System.out.println(filterApples(apples, new FilterCondition() {
            @Override
            public boolean filter(Apple apple) {
                return apple.getColor().equals("red");
            }
        }));

    }

    public static List<Apple> filterApples(List<Apple> apples, FilterCondition filterCondition) {
        return apples.stream().filter(apple -> filterCondition.filter(apple)).collect(Collectors.toList());
    }
}
