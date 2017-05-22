package com.lambda;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 21, 2017
 * Purpose : Person class
 */

public class Person {
    private String name;
    private int age;
    private char gender;

    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return this.name + " => " + this.age + " => " + this.gender;
    }
}