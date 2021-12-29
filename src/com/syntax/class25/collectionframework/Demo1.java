package com.syntax.class25.collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
    /*
    Limitation of arrays.
    arrays are fixed in size
     */
    public static void main(String[] args) {
        String name ="Amran";
        String name2="Ahmet";

        String[] names={"Amran","Rima"};

        ArrayList<String>listofNames=new ArrayList<>();
        listofNames.add("Jubir");
        listofNames.add("Tom");
        listofNames.add("John");
        listofNames.add("Amin");
        listofNames.add("Amin");


        //System.out.println(listofNames.size());
       // listofNames.remove("Tom");
       // System.out.println(listofNames.size());

        List<String>arraylist=new LinkedList<>();
        arraylist.addAll(listofNames);
        System.out.println(arraylist);
        arraylist.set(1,"AMran");
        listofNames.retainAll(arraylist);
        System.out.println(listofNames);



    }
}
