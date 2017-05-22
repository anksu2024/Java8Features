package com.lambda;

/**
 * Author     : Ankit Sarraf
 * Dated      : May 21, 2017
 * Purpose    : Understanding Lambda Series: Example 1
 * Cool Stuff : The logic that is implemented in 190 characters in normalImplementation()
 *              is implemented in 50 character in lambdaImplementation3()
 */

import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

public class LambdaExample1 {
    public static void main(String ... args) {
        originalData();
        normalImplementation();
        lambdaImplementation1();
        lambdaImplementation2();
        lambdaImplementation3();
    }

    private static void originalData() {
        System.out.println("Original List Elements out-of-order:");
        List<String> names = Arrays.asList("matt", "courtney", "daniella", "dwayne", "robin");

        for(String name : names) {
            System.out.print(name + "\t");
        }

        System.out.println();
        System.out.println("===================================================");
    }
    private static void normalImplementation() {
        System.out.println("Normal way of Sorting in Reverse Order (Java 7):");
        List<String> names = Arrays.asList("matt", "courtney", "daniella", "dwayne", "robin");

        // Normal implementation
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        for(String name : names) {
            System.out.print(name + "\t");
        }

        System.out.println();
        System.out.println("===================================================");
    }

    private static void lambdaImplementation1() {
        System.out.println("Reverse Sorting using Lambda in Java 8 (1):");
        List<String> names = Arrays.asList("matt", "courtney", "daniella", "dwayne", "robin");

        // Lambda implementation 1
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });

        for(String name : names) {
            System.out.print(name + "\t");
        }

        System.out.println();
        System.out.println("===================================================");
    }

    private static void lambdaImplementation2() {
        System.out.println("Reverse Sorting using Lambda in Java 8 (2):");
        List<String> names = Arrays.asList("matt", "courtney", "daniella", "dwayne", "robin");

        // Lambda implementation 1
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        for(String name : names) {
            System.out.print(name + "\t");
        }

        System.out.println();
        System.out.println("===================================================");
    }

    private static void lambdaImplementation3() {
        System.out.println("Reverse Sorting using Lambda in Java 8 (3):");
        List<String> names = Arrays.asList("matt", "courtney", "daniella", "dwayne", "robin");

        // Lambda implementation 1
        Collections.sort(names, (a, b) -> b.compareTo(a));

        for(String name : names) {
            System.out.print(name + "\t");
        }

        System.out.println();
        System.out.println("===================================================");
    }
}