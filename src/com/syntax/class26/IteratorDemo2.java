package com.syntax.class26;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects1=new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("Testing");

        Iterator<String> iterator=subjects1.iterator();
        //subjects1.removeIf(element -> element.length()>4 );
        System.out.println(subjects1);

        while (iterator.hasNext()){
            String element=iterator.next();
            if(element.length()>4){
                iterator.remove();
            }
        }
        System.out.println(subjects1);
    }
}
