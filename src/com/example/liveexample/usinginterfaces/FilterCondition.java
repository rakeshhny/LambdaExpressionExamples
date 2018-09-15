package com.example.liveexample.usinginterfaces;

import com.example.liveexample.Apple;

@FunctionalInterface
public interface FilterCondition {
    public boolean filter(Apple apple);
}


class GreenAppleFilter implements FilterCondition {
    @Override
    public boolean filter(Apple apple) {
        return apple.getColor().equals("green");
    }
}
