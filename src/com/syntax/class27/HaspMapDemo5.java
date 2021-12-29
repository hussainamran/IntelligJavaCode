package com.syntax.class27;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class HaspMapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double>groceriesList=new LinkedHashMap<>();
        groceriesList.put("Eggs",3.99);
        groceriesList.put("Tomato",3.2);
        groceriesList.put("Potato",10.0);
        groceriesList.put("Milk",5.0);

        Collection<String>Keys=groceriesList.keySet();
        System.out.println(Keys);
        Collection<Double>values= groceriesList.values();
        System.out.println(values);
    }
}
