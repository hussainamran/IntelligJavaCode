package com.syntax.class26.Homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class ArrayListWords {
    public static void main(String[] args) {
        /*
        Create an arrayList of words. Remove every word that ends with “e”.
         */
        ArrayList<String> words=new ArrayList<>();
        words.add("Nice");
        words.add("Life");
        words.add("The");
        words.add("Beautiful");

        for (int i = 0; i < words.size(); i++) {//removing e in anywhere from every words,
            String str=words.get(i);
            if(str.toLowerCase().endsWith("e")){
                words.set(i,str.substring(0,str.length()-1));
            }

        }
        System.out.println(words);

        Iterator<String> iterator=words.iterator();
        while (iterator.hasNext()){
            String element=iterator.next();
            if(element.toLowerCase().endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);
        }
    }

