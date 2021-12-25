package com.karvekar.consumer;

import java.util.function.Consumer;

public class ConsumerDemoWithoutLamba implements Consumer<Integer> {
    /**
     * Performs this operation on the given argument.
     *
     * @param integer the input argument
     */
    @Override
    public void accept(Integer integer) {
        System.out.println("Implementation of ConsumerDemo without Lambda "+ integer);
    }

    public static void main(String[] args) {
        new ConsumerDemoWithoutLamba().accept(10);
    }
}
