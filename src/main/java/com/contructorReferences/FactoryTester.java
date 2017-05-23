package com.contructorReferences;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : To understand how usage of constructor references
 * Note    : "::" keyword
 */

public class FactoryTester {
    public static void main(String ... args) {
        Factory<Car> carFactory = Car::new;
        Car myCar = carFactory.manufacture(
                "Tesla", "ModelS", "red");
        System.out.println(myCar);

        Factory<Bike> bikeFactory = Bike::new;
        Bike myBike = bikeFactory.manufacture(
                "2017 Ducati Monster 1200 S", "1198", "Daniel");
        System.out.println(myBike);
    }
}