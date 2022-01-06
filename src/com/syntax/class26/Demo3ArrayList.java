package com.syntax.class26;

import java.util.ArrayList;

public class Demo3ArrayList {
    public static void main(String[] args) {
        ArrayList<String> subjects1 = new ArrayList<>();
        subjects1.add("SDLC");
        subjects1.add("Manual Testing");
        subjects1.add("Java");
        subjects1.add("Git");
        subjects1.add("Selenium");
        subjects1.add("TestNg");
        for(int i=0; i<subjects1.size(); i++){// Not allowed because we don't get correct results.
           if(subjects1.get(i).length()>4){
               subjects1.remove(i);
           }
        }
        System.out.println(subjects1.indexOf(0));
    }
}
