package com.contructorReferences;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : Bike Class
 */

class Bike {
    private String name;
    private String power;
    private String owner;

    public Bike(String name, String power, String owner) {
        this.name = name;
        this.power = power;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}