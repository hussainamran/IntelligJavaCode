package com.syntax.class28.Homework;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of countries with its capital that will store countries in alphabetical order.
        Print all keys and values from a country map using for each loop and iterator.
        Print all values from a country map using for each loop and iterator.
         */
        TreeMap<String, String> country = new TreeMap<>();
        country.put("USA","Washington");
        country.put("Bangladesh","Dhaka");
        country.put("England","London");
        country.put("Pakistan","Islamabad");
        country.put("Canada","Ottawa");
        country.put("Mexico","Mexico City");
       // System.out.println(country);
        Set<Map.Entry<String,String>>set=country.entrySet();
       for (Map.Entry<String, String> entry : set) {
           System.out.println("Key " + entry.getKey() + " value " + entry.getValue());
       }
        System.out.println("***************************");
            Iterator<Map.Entry<String, String>> iterator = country.entrySet().iterator();
           while (iterator.hasNext()) {
                Map.Entry<String,String>characterStringMap=iterator.next();
                System.out.println("Keys " +characterStringMap.getKey()+ " values " +characterStringMap.getValue());
            }
        System.out.println("**************************");
            for(String coun:country.values()){
                System.out.println(coun);
            }
        System.out.println("*********************");
            Iterator<String>iterator1=country.values().iterator();
            while (iterator1.hasNext()){
                System.out.println(iterator1.next());
            }

        }
    }

