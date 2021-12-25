package com.karvekar.predicate;

import java.util.Arrays;
import java.util.List;

public class PredicateDemoWithFilterExample {
    public static void main(String[] args) {
        List<Integer> listItems = Arrays.asList(1,2,3,4,5);
        listItems.stream().filter(smallerThanThree -> smallerThanThree < 3).forEach(item -> System.out.println("Item Less than 3 : "+item));
    }
}
