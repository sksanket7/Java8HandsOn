package com.karvekar.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamWithForEach {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        stringList.add("d");

        Map<Integer, String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"a");
        integerStringMap.put(2,"b");
        integerStringMap.put(3,"c");
        integerStringMap.put(4,"d");

        //Lets print out the list using stream forEach method
        stringList.stream().forEach(i -> System.out.println(i));

        //forEach method can be directly invoke on map object without using stream
        integerStringMap.forEach((key,value) -> System.out.println(key+" "+value));

        //to implement it using stream then need to use entrySet of map
        integerStringMap.entrySet().stream().forEach(i-> System.out.println(i));
    }
}
