package com.lambda;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : Class to store Employee data
 */

class Employee {
    private String name;
    private int dept;

    Employee(String name, int dept) {
        this.name = name;
        this.dept = dept;
    }

    int getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "Employee => " +
                "<name: " + name +
                ", dept: " + dept +
                ">";
    }
}