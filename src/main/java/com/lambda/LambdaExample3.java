package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : Understand utility of Predicate interface
 * Result  : Print all the Employee in the Department 30
 * Note    : How to pass the predicate in the function filterAndPrint
 */

public class LambdaExample3 {
    public static void main(String ... args) {
        // Nothing fancy
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jake", 10));
        employeeList.add(new Employee("Sheila", 20));
        employeeList.add(new Employee("Tina", 20));
        employeeList.add(new Employee("Harvey", 30));
        employeeList.add(new Employee("Smith", 10));
        employeeList.add(new Employee("Amanda", 30));
        employeeList.add(new Employee("Miranda", 30));
        employeeList.add(new Employee("Dwayne", 10));
        employeeList.add(new Employee("Jack", 10));
        employeeList.add(new Employee("Jesse", 30));

        // Second Argument is the predicate passed to filterAndPrint()
        filterAndPrint(employeeList, e -> e.getDept() == 30);
    }

    private static void filterAndPrint(List<Employee> employeeList, Predicate<Employee> predicate) {
        for(Employee employee: employeeList) {
            if(predicate.test(employee)) {
                System.out.println(employee);
            }
        }
    }
}