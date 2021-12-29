package com.syntax.class27;

import java.util.TreeMap;

public class TreeMapDemo4 {
    public static void main(String[] args) {
        TreeMap<String, Double>groceriesList=new TreeMap<>();
        groceriesList.put("Eggs",3.99);
        groceriesList.put("Tomato",3.2);
        groceriesList.put("Potato",10.0);
        groceriesList.put("Milk",5.0);
        groceriesList.put("Steak",15.0);

        TreeMap<String, Double>groceriesList1=new TreeMap<>();
        groceriesList1.put("Soap",20.0);
        groceriesList1.put("Shampo",13.0);
        groceriesList1.put("beer",2.0);

        TreeMap<String, Double>groceriesList2=new TreeMap<>();
        groceriesList2.putAll(groceriesList);
        groceriesList2.putAll(groceriesList1);
        System.out.println(groceriesList2);

    }
}
