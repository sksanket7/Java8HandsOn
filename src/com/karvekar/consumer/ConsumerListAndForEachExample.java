package com.karvekar.consumer;

import java.util.Arrays;
import java.util.List;

public class ConsumerListAndForEachExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        list.stream().forEach(param-> System.out.println("listItem : "+param));
    }
}
