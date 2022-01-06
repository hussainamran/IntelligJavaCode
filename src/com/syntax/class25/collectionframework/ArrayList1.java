package com.syntax.class25.collectionframework;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        List<Integer>list=Arrays.asList(12,23,23,44,56,23);

        Optional<Integer>minValue=list.stream().min(Comparator.comparing(Integer::intValue));
        if(minValue.isPresent()){
            System.out.println(minValue.get());
        }
        Optional<Integer>maxValue=list.stream().max(Comparator.comparing(Integer::intValue));
        if(maxValue.isPresent())
        System.out.println(maxValue.get());
        list.forEach(elemet-> System.out.print(elemet+" "));

    }


}
