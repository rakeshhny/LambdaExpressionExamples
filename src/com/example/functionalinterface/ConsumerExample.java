package com.example.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printStringLength = s -> System.out.println(s.length());
        Consumer<String> convertToUpperThenPrint = s -> System.out.println(s.toUpperCase());

        String inputString = "Hello World!";

        accept(inputString, printStringLength);
        accept(inputString, convertToUpperThenPrint);
    }

    public static void accept(String inputString, Consumer<String> operationOnString) {
        operationOnString.accept(inputString);
    }
}
