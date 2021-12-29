package com.syntax.revireclass12;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Hashtable<String,Integer>hashMap=new Hashtable<>();// Thread safe

        hashMap.put("Hasim",23);
        hashMap.put("Damir",25);
        hashMap.put("Alona",17);
        hashMap.put("Marina",16);
        System.out.println(hashMap);

        Set<String>keys=hashMap.keySet();

        keys.removeIf(x-> x.length()==5);//removing the elements which have a name that is more then 5 characters
        System.out.println(hashMap);

        hashMap.values().removeIf(x-> x>16);//removing base only values

        //removing elements based on both kyes and value from map

        hashMap.entrySet().removeIf(entry-> entry.getKey().endsWith("a")&& entry.getValue()==16);
        System.out.println(hashMap);

    }
}
