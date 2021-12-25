package com.karvekar.predicate;

import java.util.function.Predicate;

public class PredicateDemoWithLamda {
    public static void main(String[] args) {
        Predicate<Integer> predicate = number->{
          if (number>10)
              return true;
          else
              return false;
        };
        System.out.println(predicate.test(5));
    }
}
