package com.syntax.peactice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        Set<String> courses = new HashSet<>();
        courses.add("JAva");
        courses.add("C++");
        courses.add("Python");
        courses.add("C");
        courses.add("Cucumber");
        courses.add("Selenium");
        for (String corse:courses
             ) {
            //System.out.println(corse);
        }
        Iterator<String>iterator= courses.iterator();
        while (iterator.hasNext()){
           String text=iterator.next();
            //System.out.println(text);
        }
        int i=0;
        while (i<courses.size()){
            System.out.println(courses);
            i++;
            break;
        }
        System.out.println("********************************");
        //courses.forEach(couse-> System.out.println(couse));// method with lambda
        courses.stream().filter(cousre->!"C".equals(cousre))
                .forEach(cousre-> System.out.println(cousre));


           }
        }


