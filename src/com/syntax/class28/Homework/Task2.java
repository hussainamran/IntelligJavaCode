package com.syntax.class28.Homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.
         */
        Map<Integer, String> BestBuyStore = new HashMap<>();
        BestBuyStore.put(1234451, "Sony TV");
        BestBuyStore.put(1134451, "IPhone");
        BestBuyStore.put(1234251, "Camera");
        BestBuyStore.put(1209445, "Video Game");
        BestBuyStore.put(1234123, "Printer");

        Set<Map.Entry<Integer, String>> entries=BestBuyStore.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Keys " + entry.getKey() + ", values " + entry.getValue());
        }
        System.out.println("*************************");
        Iterator<Map.Entry<Integer,String>> entryIterator=entries.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<Integer,String>item=entryIterator.next();
            System.out.println(item.getKey()+" "+item.getValue());
        }
        System.out.println("******************************");
        BestBuyStore.forEach((k,v)-> System.out.println("Key "+k+ " Value " +v));

    }
}