package com.syntax.class26.Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDrink {
    public static void main(String[] args) {
        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
         */
        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Ginger ale");
        drinks.add("Juice");
        drinks.add("Pepsi");
        drinks.add("Coke");
        drinks.add("Smoothies");
        Iterator<String> iterator=drinks.iterator();
        //drinks.removeIf(element -> element.contains("e") ||element.contains("a"));

        for (int i = 0; i < drinks.size(); i++) {

            if(drinks.get(i).toLowerCase().replaceAll("[aeifdnk]","").length()< drinks.get(i).length()){
                drinks.set(i,"Water");//when multiple letter to replace we use this method
            }
        }
        System.out.println(drinks);
        System.out.println("*******************************");

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).toLowerCase().contains("e")||drinks.get(i).toLowerCase().contains("a")){
                drinks.set(i,"water");
            }
        }
        System.out.println(drinks);
        System.out.println("**************************");
        while (iterator.hasNext()){
            String element=iterator.next();
            if(element.contains("a")||element.contains("e")){
                iterator.remove();
                element="water";
                element="water";
                System.out.println(element);
            }

        }
        }
    }

