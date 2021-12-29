package com.syntax.class26.Homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCar {
    public static void main(String[] args) {
        /*
        Create an arraylist of cars and retrieve all the values using 3 different ways.
         */
        ArrayList<String> car = new ArrayList<>();
        car.add("Tesla");
        car.add("Honda");
        car.add("Volvo");
        car.add("Jaguar");
        car.add("Toyota");
        car.add("Lexus");
        car.add("Audi");
        System.out.print(car);
        System.out.println("*********************************");
        for (String arr : car) {
            System.out.print(arr + " ");
        }
        System.out.println("**************************");
        Iterator<String> iterator = car.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("******************************");
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }
        System.out.println("**********************************");
        int i=0;
        while(i< car.size()){
            System.out.println(car.get(i));
            i++;
        }
        System.out.println("************************");
        System.out.println(car.get(car.size()-1));
    }
}


