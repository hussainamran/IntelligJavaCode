package com.syntax.class26;

import java.util.ArrayList;

public class ArrayDemo3multipleListinside {
    public static void main(String[] args) {
        ArrayList<String>subjects=new ArrayList<>();
        subjects.add("math");
        ArrayList<String>subjects1=new ArrayList<>();
        subjects1.add("Science");
        ArrayList<String>subjects2=new ArrayList<>();
        ArrayList<String>subjects3=new ArrayList<>();
        ArrayList<String>subject4=new ArrayList<>();
        ArrayList<ArrayList<String>> arrayLists=new ArrayList<>();
        arrayLists.add(subjects);
        arrayLists.add(subjects1);
        arrayLists.add(subjects2);
        arrayLists.add(subjects3);
        arrayLists.add(subject4);
        arrayLists.size();
        System.out.println(arrayLists);

    }
}
