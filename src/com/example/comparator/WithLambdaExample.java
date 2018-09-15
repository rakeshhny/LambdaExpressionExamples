package com.example.comparator;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WithLambdaExample {

    public static void main(String[] args) {

        List<Apple> apples = Arrays.asList(
                new Apple(new BigDecimal(21)),
                new Apple(new BigDecimal(20)),
                new Apple(new BigDecimal(22)));

        System.out.println("Before sorting......");

        System.out.println(apples);

        Comparator<Apple> appleComparator = (Apple o1, Apple o2) -> o1.getWeight().compareTo(o2.getWeight());
//        Comparator<Apple> appleComparator1 = (o1, o2) -> o1.getWeight().compareTo(o2.getWeight());
//        Comparator<Apple> appleComparator2 = (o1, o2) -> {return o1.getWeight().compareTo(o2.getWeight());};

//        Collections.sort(apples, appleComparator);
        Collections.sort(apples, (o1, o2) -> o1.getWeight().compareTo(o2.getWeight()));

        System.out.println("After sorting using appleComparator.....");

        System.out.println(apples);
    }
}
