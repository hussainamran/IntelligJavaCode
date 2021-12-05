package com.syntax.class25.collectionframework;

import java.util.ArrayList;

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
        System.out.println(listofNames.size());
        listofNames.remove("Tom");
        System.out.println(listofNames.size());

    }
}
