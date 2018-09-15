package com.example.liveexample;

import java.math.BigDecimal;

public class Apple {

    private BigDecimal weight;
    private String color;

    public Apple(BigDecimal weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Apple weight="+getWeight()+ " color="+ getColor();
    }
}
