package com.example.liveexample.traditional;

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
        System.out.println(getGreenApples(apples));

    }

    public static List<Apple> getRedApples(List<Apple> apples) {
        return apples.stream().filter(apple -> apple.getColor().equals("red")).collect(Collectors.toList());
    }

    public static List<Apple> getGreenApples(List<Apple> apples) {
        return apples.stream().filter(apple -> apple.getColor().equals("green")).collect(Collectors.toList());
    }


}
