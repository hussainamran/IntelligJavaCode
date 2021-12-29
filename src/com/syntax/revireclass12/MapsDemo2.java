package com.syntax.revireclass12;

import java.util.LinkedHashMap;

import static com.syntax.utils.MapUtills.sortByValue;

public class MapsDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkhashmap=new LinkedHashMap<>();

        linkhashmap.put("Hasim",23);
        linkhashmap.put("Damir",25);
        linkhashmap.put("Alona",17);// sorted by value
        linkhashmap.put("Marina",16);
        System.out.println(linkhashmap);

        linkhashmap=sortByValue(linkhashmap);
        System.out.println(linkhashmap);
    }
}
