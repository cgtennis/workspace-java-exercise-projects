package org.example;

public class SimpleCalculator {

    public int add (int numberA, int numberB){

        if ((long) numberA + numberB > Integer.MAX_VALUE) {
            throw new ArithmeticException("Sum exceeds the maximum allowed integer value");
        }
        else
            return numberA + numberB;
    }
}
