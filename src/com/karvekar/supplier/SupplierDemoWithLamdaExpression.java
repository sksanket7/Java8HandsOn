package com.karvekar.supplier;

import java.util.function.Supplier;

public class SupplierDemoWithLamdaExpression {
    public static void main(String[] args) {
        Supplier<String> stringSupplier = () -> "Supplier with Lamda Expression";
        System.out.println(stringSupplier.get());
    }
}
