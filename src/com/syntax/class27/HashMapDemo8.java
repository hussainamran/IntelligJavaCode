package com.syntax.class27;

import java.util.*;

public class HashMapDemo8 {
    public static void main(String[] args) {
        HashMap<String, Double> groceriesList=new LinkedHashMap<>();
        groceriesList.put("Eggs",3.99);
        groceriesList.put("Tomato",3.2);
        groceriesList.put("Potato",10.0);
        groceriesList.put("Milk",5.0);

        System.out.println(groceriesList);
        Set<Map.Entry<String, Double>> entrySet=groceriesList.entrySet();
        for(Map.Entry<String,Double> entry:entrySet){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
