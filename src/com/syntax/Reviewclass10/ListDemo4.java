package com.syntax.Reviewclass10;

import java.util.ArrayList;
import java.util.List;

public class ListDemo4 {
    public static void main(String[] args) {

        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(52);
        arrayList.add(43);
        arrayList.add(32);
        arrayList.add(10);
        arrayList.add(30);

       /* System.out.println(arrayList.size());
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.contains(10));
        System.out.println(arrayList.subList(3,5));*///print anycharacter or number that is index at 3 and follow by next number conut from1
        System.out.println(arrayList.stream().filter(a-> a>10).count());//print any element is bigger then that element you declare
        System.out.println(arrayList);//print all the element from the array
    }
}
