package com.defaultMethod;

/**
 * Author    : Ankit Sarraf
 * Dated     : May 21, 2017
 * Purpose   : To understand default interface methods
 * Reference :
 */

public class UnderstandingDefaultMethods {
    public static void main(String ... args) {
        Formula formula = new Formula() {
            // Initiation of unimplemented interface method
            public double calculateExpression(int x, int y) {
                // The expression to be calculated: (100x) ^ 0.5 + y ^ 2
                return sqrt(100 * x) + square(y);
            }
        };

        int x = 64;
        int y = 20;

        // Using the calculateExpression method
        System.out.println("Result of calculate(64, 20): " + formula.calculateExpression(x, y));

        // The default interface methods be used out of box as well
        System.out.println("Result of sqrt(64): " + formula.sqrt(x));
        System.out.println("Result of square(20): " + formula.square(y));
    }
}