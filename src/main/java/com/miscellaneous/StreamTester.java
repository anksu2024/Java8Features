package com.miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : Understanding utility of Java8 Stream
 * Note    : Stream is created on java.util.Collection (List or Set)
 */

public class StreamTester {
    public static void main(String ... args) {
        List<String> myList = new ArrayList<>();
        myList.add("Scott");
        myList.add("Ted");
        myList.add("Kennedy");
        myList.add("Sophie");
        myList.add("Gordan");
        myList.add("Yumi");

        understandingStream1(myList);
        understandingStream2(myList);
        understandingStream3(myList);
        understandingStream4(myList);
        understandingStream5(myList);
        understandingStream6(myList);
        understandingStream7();
    }

    private static void understandingStream1(List<String> myList) {
        System.out.println("Example 1: Filter and Print");
        myList.stream().
                filter(string -> string.startsWith("S")).
                forEach(System.out::println);
        System.out.println("==========================================");
    }

    private static void understandingStream2(List<String> myList) {
        System.out.println("Example 2: Reverse Sort and Print");
        myList.stream().
                sorted((a, b) -> b.compareTo(a)).       // sorted() => Ascending order
                forEach(System.out::println);
        System.out.println("==========================================");
    }

    private static void understandingStream3(List<String> myList) {
        System.out.println("Example 3: Map and Print");
        myList.stream().
                map(String::toUpperCase).
                forEach(System.out::println);
        System.out.println("==========================================");
    }

    private static void understandingStream4(List<String> myList) {
        System.out.println("Example 4: AnyMatch, NoneMatch And Print");
        // Any Match and NoneMatch return true and false only
        // Filter also returns true/ false but end result is to get
        // the matching records.

        System.out.println("Is there any name starting with S: " +
                myList.stream().
                anyMatch(s -> s.startsWith("S")));
        System.out.println("Is there no name starting with Z: " +
                myList.stream().
                        noneMatch(s -> s.startsWith("Z")));
        System.out.println("Is there any name starting with P: " +
                myList.stream().
                        anyMatch(s -> s.startsWith("P")));
        System.out.println("==========================================");
    }

    private static void understandingStream5(List<String> myList) {
        System.out.println("Example 5: Counting elements");

        System.out.println("Number of people: " + myList.stream().count());
        System.out.println("==========================================");
    }

    private static void understandingStream6(List<String> myList) {
        System.out.println("Example 6: Reduce method utility - concatenate elements");

        Optional<String> reducedString = myList.stream().reduce((a, b) -> a + "#" + b);
        if(reducedString.isPresent()) {
            System.out.println(reducedString.get());
        } else {
            System.out.println("NULL");
        }

        System.out.println("==========================================");
    }

    private static void understandingStream7() {
        System.out.println("Example 7: Count using Parallel Stream and Sequential Stream");

        List<String> myStrings = new ArrayList<>();
        for(int i = 0 ; i < 1000000 ; i++) {
            myStrings.add(UUID.randomUUID().toString());
        }

        // Parallel Stream
        long ps0 = System.nanoTime();
        myStrings.parallelStream().sorted();
        long ps1 = System.nanoTime();

        // Sequential Stream
        long ss0 = System.nanoTime();
        myStrings.stream().sorted();
        long ss1 = System.nanoTime();

        System.out.println("Parallel Sort took: " + (ps1 - ps0) + " clock cycles");
        System.out.println("Sequential Sort took: " + (ss1 - ss0) + " clock cycles");

        System.out.println("==========================================");
    }
}