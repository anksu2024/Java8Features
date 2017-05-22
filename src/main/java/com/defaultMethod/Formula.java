package com.defaultMethod;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 21, 2017
 * Purpose : Interface: 1 unimplemented method and 2 default methods
 */

interface Formula {
    double calculateExpression(int x, int y);

    default double sqrt(int x) {
        return Math.sqrt(x);
    }

    default double square(int x) {
        return Math.pow(x, 2);
    }
}