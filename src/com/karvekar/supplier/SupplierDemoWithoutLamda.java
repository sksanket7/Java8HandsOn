package com.karvekar.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemoWithoutLamda implements Supplier<String> {

    /**
     * Gets a result.
     *
     * @return a result
     */
    @Override
    public String get() {
        return "Supplier Without Lamda Expression";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = new SupplierDemoWithoutLamda();
        System.out.println(supplier.get());
    }
}
