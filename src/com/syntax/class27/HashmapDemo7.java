package com.syntax.class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class HashmapDemo7 {
    public static void main(String[] args) {
        HashMap<String, Double> groceriesList=new LinkedHashMap<>();
        groceriesList.put("Eggs",3.99);
        groceriesList.put("Tomato",3.2);
        groceriesList.put("Potato",10.0);
        groceriesList.put("Milk",5.0);

        System.out.println(groceriesList);
        Iterator<Double>iterator=groceriesList.values().iterator();
        while (iterator.hasNext()){
            Double value=iterator.next();
            if(value==3.2){
                iterator.remove();
            }
        }
        System.out.println(groceriesList);
    }
}
