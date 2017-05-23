package com.contructorReferences;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : Car Class
 */

public class Car {
    private String name;
    private String model;
    private String color;

    public Car(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}