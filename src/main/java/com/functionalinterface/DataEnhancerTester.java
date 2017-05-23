package com.functionalinterface;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 22, 2017
 * Purpose : This class depicts the utility of FunctionalInterface Annotation
 */

public class DataEnhancerTester {
    public static void main(String ... args) {
        DataEnhancer<String, String> dataEnhancer1 = (input) -> "Hello " + input + "!!";
        DataEnhancer<String, Integer> dataEnhancer2 = (input) -> Integer.parseInt(input);
        DataEnhancer<Double, String> dataEnhancer3 = (input) -> "Your salary is: $" + input;

        System.out.println(dataEnhancer1.enhance("Ankit"));
        System.out.println(dataEnhancer2.enhance("2183"));
        System.out.println(dataEnhancer3.enhance(181391.23));
    }
}