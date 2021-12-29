package com.syntax.class28.Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        /*
       Create a collection of integers in which you can keep duplicates.
       Write a logic to find sum of all integers
         */
        Collection<Integer> elements = new ArrayList<>();
        elements.add(12);
        elements.add(12);
        elements.add(34);
        elements.add(32);
        Integer sum=0;
        for(Integer value:elements){
            sum=value+sum;
        }
        System.out.println(sum);
        Iterator<Integer> iterator = elements.iterator();
        Integer sum1 = 0;
        while (iterator.hasNext()) {
            Integer total = iterator.next();
            sum1 = total + sum1;
        }
        System.out.println(sum1);

    }
}