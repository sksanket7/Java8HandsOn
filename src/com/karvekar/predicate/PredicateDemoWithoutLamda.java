package com.karvekar.predicate;

import java.util.function.Predicate;

public class PredicateDemoWithoutLamda implements Predicate<Integer> {
    /**
     * Evaluates this predicate on the given argument.
     *
     * @param integer the input argument
     * @return {@code true} if the input argument matches the predicate,
     * otherwise {@code false}
     */
    @Override
    public boolean test(Integer integer) {
        if (integer>10)
            return true;
            else
                return false;
    }

    public static void main(String[] args) {
        Predicate<Integer> integerPredicate = new PredicateDemoWithoutLamda();
        System.out.println(integerPredicate.test(5));
    }
}
