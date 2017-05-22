package com.lambda;

/**
 * Author      : Ankit Sarraf
 * Dated       : May 21, 2017
 * Purpose     : To understand Lambda functions
 * Observation : Java 7 -> Normal Implementation took 262 characters of code
 *               Java 8 -> Lambda function implementation took 131 characters of code
 */

import java.util.List;
import java.util.ArrayList;

public class LambdaExample2 {
    public static void main(String ... args) {
        // Find all the Females with age (18, 30)

        List personList = populatePersonList();
        filterAndPrint(personList, "Normal Java 7 Way", new FilterPerson() {
            @Override
            public boolean filter(Person person) {
                return person.getGender() == 'F' &&
                        person.getAge() > 18 &&
                        person.getAge() < 30;
            }
        });

        // Lambda implementation
        filterAndPrint(personList, "Java 8 Way using Lambda Functions",
                person -> person.getGender() == 'F' &&
                        person.getAge() > 18 &&
                        person.getAge() < 30);
    }

    private static List<Person> populatePersonList() {
        // No fancy code. Just adding a few records in the list

        List<Person> personList = new ArrayList<>();
        Person p;
        p = new Person("Jessica", 28, 'F');
        personList.add(p);
        p = new Person("Jane", 30, 'F');
        personList.add(p);
        p = new Person("Tina", 17, 'F');
        personList.add(p);
        p = new Person("Alex", 25, 'M');
        personList.add(p);
        p = new Person("Tony", 24, 'M');
        personList.add(p);

        return personList;
    }

    private static void filterAndPrint(
            List<Person> personList, String filterType, FilterPerson tester) {
        System.out.println(filterType);
        for(Person person: personList) {
            if(tester.filter(person)) {
                System.out.println(person);
            }
        }
        System.out.println("=================================");
    }
}