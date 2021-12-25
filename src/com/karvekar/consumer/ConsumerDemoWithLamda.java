package com.karvekar.consumer;

import java.util.function.Consumer;

public class ConsumerDemoWithLamda {

    public static void main(String[] args) {
        Consumer consumer = (integer) ->System.out.println("Implementation of ConsumerDemo with Lambda "+ integer);
        consumer.accept(10);
    }
}
