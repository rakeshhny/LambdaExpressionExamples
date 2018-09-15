package com.example.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> convertStringToLength = s -> s.length();
        Function<List<String>, Map<String, Integer>> convertListStringToMapStringWithLength =
                strings -> strings.stream().collect(Collectors.toMap(str -> str, str -> str.length()));

        String inputString = "HelloWorld";

        System.out.println(convertStringToLength.apply(inputString));

        List<String> strings = Arrays.asList("String1", "String12", "String112", "String1234");

        System.out.println(convertListStringToMapStringWithLength.apply(strings));

        System.out.println(apply("string", s-> s.toUpperCase()));
        System.out.println(apply(strings, strs -> strs.stream().reduce((s1, s2) -> s1.concat(s2)).get()));
    }

    public static <T> String apply(T inputData, Function<T, String> function) {
        return function.apply(inputData);
    }
}
