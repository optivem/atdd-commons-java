package com.optivem.atdd.commons;

/**
 * Common mathematical utility functions.
 */
public class MathCommons {
    
    /**
     * Private constructor to prevent instantiation.
     */
    private MathCommons() {
        throw new UnsupportedOperationException("Utility class");
    }
    
    /**
     * Adds two integers and returns the result.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the sum of a and b
     */
    public static int addition(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts two integers and returns the result.
     * 
     * @param a the first integer
     * @param b the second integer
     * @return the difference of a and b
     */
    public static int subtraction(int a, int b) {
        return a - b;
    }
}
