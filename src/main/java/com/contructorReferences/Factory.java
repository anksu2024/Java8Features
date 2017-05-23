package com.contructorReferences;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 23, 2017
 * Purpose : Factory that creates Bike or Car based on the Generic leveraged
 */

interface Factory<T> {
    T manufacture(String arg0, String arg1, String arg2);
}