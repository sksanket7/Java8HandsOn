package com.karvekar.supplier;

import java.util.Arrays;
import java.util.List;

public class SupplierDemoWithStreamFindByOrElseGet {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList();
        //Following findBy() method search if there are any elements are present, if there
        // are no elements then run the get method
        System.out.println(stringList.stream().findAny().orElseGet(() -> "Supplier with Lamda Expression"));
    }
}
