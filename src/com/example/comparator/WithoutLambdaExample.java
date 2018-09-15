package com.example.comparator;

import java.math.BigDecimal;
import java.util.*;

public class WithoutLambdaExample {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(
                new Apple(new BigDecimal(21)),
                new Apple(new BigDecimal(20)),
                new Apple(new BigDecimal(22)));

        System.out.println("Before sorting......");

        System.out.println(apples);

        Comparator<Apple> appleComparator = new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        };

        Collections.sort(apples, appleComparator);

        System.out.println("After sorting using appleComparator.....");

        System.out.println(apples);
    }
}
