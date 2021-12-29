package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        Create an ArrayList that will store 5 names into it.
    Find out whether the given ArrayList is empty or not?
    Check whether the specific name is present in an ArrayList or not?
    Find the size of your arrayList and print all values from that
         */
        ArrayList<String>names=new ArrayList<>();
        names.add("Tom");
        names.add("John");
        names.add("Amran");
        names.add("Rima");
        names.add("Ahmed");
       if(names.isEmpty()){
           System.out.println(true);
       }else {
           System.out.println(false);
       }
       if(names.contains("Tom")){
           System.out.println(" The name Tom is available");
       }else {
           System.out.println("The name Tom is not available");
       }

        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names);
    }
}
