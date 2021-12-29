package com.syntax.class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo9 {
    public static void main(String[] args) {
        HashMap<String, Double> groceriesList=new LinkedHashMap<>();
        groceriesList.put("Eggs",3.99);
        groceriesList.put("Tomato",3.2);
        groceriesList.put("Potato",10.0);
        groceriesList.put("Milk",5.0);

        System.out.println(groceriesList);
        Iterator<Map .Entry<String, Double>>iterator=groceriesList.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Double>entry=iterator.next();
            if(entry.getKey().equals("Milk")&& entry.getValue()==5.0){
                iterator.remove();
            }
        }
        System.out.println(groceriesList);
    }
}
