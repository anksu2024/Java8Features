package com.optionalReference;

import java.util.Optional;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : Understanding java.util.Optional class
 */

public class OptionalTester {
    public static void main(String... args) {
        OptionalTester optionalTester = new OptionalTester();

        System.out.println("Case 1: When no Integer is Null");
        System.out.println("11 + 23 = " +
                optionalTester.sum(Optional.of(new Integer(11)), Optional.of(new Integer(23))));

        System.out.println("Case 2: When 1 Integer is Null");
        System.out.println("null + 23 = " +
                optionalTester.sum(Optional.ofNullable(null), Optional.of(new Integer(23))));

        System.out.println("Case 3: When both Integer is Null");
        System.out.println("null + null = " +
                optionalTester.sum(Optional.ofNullable(null), Optional.ofNullable(null)));
    }

    public Integer sum(Optional<Integer> a, Optional<Integer> b) {
        System.out.println("1st is Present? " + a.isPresent());
        System.out.println("2nd is Present? " + b.isPresent());

        Integer val1 = a.orElse(new Integer(13));
        Integer val2 = b.orElse(new Integer(31));

        return val1 + val2;
    }
}