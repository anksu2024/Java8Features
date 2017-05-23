package com.miscellaneous;

import java.util.HashMap;
import java.util.Map;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : Understanding new functions in java.util.Map class
 */

public class MapTester {
    public static void main(String ... args) {
        Map<Integer, String> map = new HashMap<>();

        map.putIfAbsent(1, "James");
        System.out.println("1 => " + map.get(1));
        map.replace(1, "Spark");
        System.out.println("1 => " + map.get(1));
        map.replace(1, "Spark", "Stacey");
        System.out.println("1 => " + map.get(1));

        map.put(2, "Steve");
        System.out.println("2 => " + map.get(2));
        map.remove(2, "Jacob");
        System.out.println("2 => " + map.getOrDefault(2, "Shane"));
    }
}