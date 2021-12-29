package com.syntax.revireclass12;

import java.util.HashSet;
import java.util.Iterator;

public class setDemo {
    public static void main(String[] args) {
        HashSet<Integer>hasset=new HashSet<>();
        hasset.add(10);
        hasset.add(20);
        hasset.add(30);//duplicate are not allowed so this will be ignored
        hasset.add(30);
        System.out.println(hasset);
        for(Integer number:hasset){
            System.out.println(number);// printing element one by one
        }
        //hasset.remove(20);
        System.out.println(hasset);

        hasset.removeIf(number-> number>10);


        Iterator<Integer>iterator=hasset.iterator();
        while(iterator.hasNext()){
            Integer number=iterator.next();
            if(number>10){
                iterator.remove();
            }
        }
        System.out.println(hasset);
    }
}
