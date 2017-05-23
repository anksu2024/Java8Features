package com.functionalinterface;

/**
 * Author  : Ankit Sarraf
 * Dated   : May 22, 2017
 * Purpose : To understand Functional Interface
 * Note    : There can be only 1 abstract methods
 *           Default Method isn't an abstract method
 */

@FunctionalInterface
public interface DataEnhancer<A, B> {
    B enhance(A input);
}
