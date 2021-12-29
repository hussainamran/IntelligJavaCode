package com.syntax.class28.Homework;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        /*
        Create the collection that will store single uniques Objects of a String type in which order is preserved.
        Write a logic to concatenate all string from the collection.
         */
        Collection<String> entry = new LinkedHashSet<>();
        entry.add("Cup");
        entry.add("Mug");
        entry.add("Bottle");
        entry.add("Gallon");
        entry.add("Bowl");
        //System.out.println(entry);
        StringBuilder values=new StringBuilder();
        for(String str:entry) {
            values.append(str);
        }
        System.out.println(values+" " );
    }
}
