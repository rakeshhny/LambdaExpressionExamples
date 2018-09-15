package com.example.comparator;

import java.math.BigDecimal;

public class Apple {
    private BigDecimal weight;

    public Apple(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Weight = " + this.getWeight();
    }
}
