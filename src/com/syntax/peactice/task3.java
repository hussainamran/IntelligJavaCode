package com.syntax.peactice;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.put(5, "five");
        hashMap.put(6, "six");
      for(Map.Entry<Integer,String>map:hashMap.entrySet()){
          System.out.println("Keys " +map.getKey()+ " Value "+ map.getValue());
      }
        System.out.println("************************");
      Iterator<Map.Entry<Integer,String>>element=hashMap.entrySet().iterator();
      while (element.hasNext()){
          Map.Entry<Integer,String>entry=element.next();
          System.out.println("Keys " +entry.getKey()+ " Value " +entry.getValue());
      }
        System.out.println("********************************");
       hashMap.forEach((k,v)-> System.out.println("Key " +k+ " Value " +v));
    }
}