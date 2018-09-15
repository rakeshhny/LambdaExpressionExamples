package com.example.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<String> predicateTestStringLengthGreaterThanTen = s -> s.length() > 10;
        Predicate<String> predicateStringContainsWordString = s -> s.contains("string");

        String inputString1 = "string length more than 10";
        String inputString2 = "tinystr";

        System.out.println(testString(inputString1, predicateTestStringLengthGreaterThanTen));
        System.out.println(testString(inputString2, predicateTestStringLengthGreaterThanTen));

        System.out.println(testString(inputString1,predicateStringContainsWordString));
        System.out.println(testString(inputString2,predicateStringContainsWordString));
    }

    public static boolean testString(String inputString, Predicate<String> condition) {
        return condition.test(inputString);
    }
}
