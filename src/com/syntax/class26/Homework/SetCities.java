package com.syntax.class26.Homework;

import java.util.*;

public class SetCities {
    public static void main(String[] args) {
        /*
        Create a Set of cities in which you want to make sure that insertion order is maintained.
        Then remove any city that starts with “A”;
         */
        LinkedHashSet<String>city=new LinkedHashSet<>();
        city.add("Washington");
        city.add("London");
        city.add("Berlin");
        city.add("Oslo");
        city.add("Algiers");
        Iterator<String> iterator=city.iterator();
        //subjects1.removeIf(element -> element.length()>4 );
        System.out.println(city);
        while (iterator.hasNext()){
            String element=iterator.next();
            if(element.startsWith("A")){
                iterator.remove();
                System.out.println(city);
            }
        }
    }
}
