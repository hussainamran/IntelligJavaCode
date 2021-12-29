package com.syntax.class26.Homework;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
         How can you remove all duplicates from ArrayList?
         */
        ArrayList<String> alist = new ArrayList<>();
        alist.add("John");
        alist.add("Jane");
        alist.add("James");
        alist.add("Jasmine");
        alist.add("Jane");
        alist.add("James");
        System.out.println("Before "+alist);


        Set<String> listWithoutDuplicates = new LinkedHashSet<>(alist);
        //System.out.println(listWithoutDuplicates);
        alist=new ArrayList<>(listWithoutDuplicates);
        System.out.println(alist);
        //alist.clear();

        //alist.addAll(listWithoutDuplicates);
        //System.out.println("list without duplicates : " + alist);


    }
}