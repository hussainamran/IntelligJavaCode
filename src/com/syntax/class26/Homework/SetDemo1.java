package com.syntax.class26.Homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries. In this set we want all objects to be
         sorted in alphabetical order. Using 2 different ways retrieve all elements from set.
         */
        TreeSet<String> country = new TreeSet<>();
        country.add("Ukraine");
        country.add("Canada");
        country.add("England");
        country.add("Japan");
        country.add("USA");
        System.out.println(country);
        for (String str : country) {
            System.out.print(str + " ");
        }
        Iterator<String> iterator=country.iterator();
        //subjects1.removeIf(element -> element.length()>4 );
        System.out.println();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            }
        }
    }

