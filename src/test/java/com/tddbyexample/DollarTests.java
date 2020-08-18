package com.tddbyexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DollarTests {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        five.times(2);

        assertEquals(10, five.amount);
    }
}
