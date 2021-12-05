package com.syntax.class25.collectionframework;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        System.out.println(numbers);

        ArrayList<Boolean>booleans=new ArrayList<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        //booleans.add("ashsdh");
        System.out.println(booleans);

        System.out.println(booleans.size());
    }
}
