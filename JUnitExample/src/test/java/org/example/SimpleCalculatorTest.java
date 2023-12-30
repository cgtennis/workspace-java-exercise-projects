package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void twoPlusTwoShouldEqualFour() {
        var calculator = new SimpleCalculator();
        assertEquals(4, calculator.add(2,2));

    }

    @Test
    void twoPlusFourShouldEqualSix(){
        var calc = new SimpleCalculator();
        assertEquals(6, calc.add(2,4));
    }

    @Test
    void integerTooLarge()
    {
        var calc = new SimpleCalculator();
        assertThrows(ArithmeticException.class, () -> calc.add(2147483640,10000));
    }

}