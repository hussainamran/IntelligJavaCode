package com.syntax.Reviewclass10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();

        LinkedList<String>List1=new LinkedList<>();//if not planning to use polymorphism always better

        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Coke");
        drinks.add(0,"Pepsi");// use it to add the element at specfic index
        //drinks.add(5,"Pepsi");// use it to add the element at specifice index
        // if that index does not exist we will be getting the indexoutBond exception
        drinks.add("Fanta");
        System.out.println(drinks);
        drinks.remove(0);
        System.out.println(drinks);
        System.out.println(drinks.get(0));
        drinks.set(0,"Coke");// replace the elements at this index

    }
}
