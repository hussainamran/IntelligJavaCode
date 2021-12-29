package com.syntax.class27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,100};
        for(int number:numbers){
            if(number==100){
                System.out.println("Found");
            }
        }
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(20);
        arrayList.add(50);
        arrayList.add(70);
        arrayList.add(90);
        arrayList.add(30);
        System.out.println(arrayList.contains(70));

        Map<Integer,String>studentsInfo=new HashMap<>();
        studentsInfo.put(1233,"Amran");
        studentsInfo.put(1232,"Rima");
        System.out.println(studentsInfo.get(1232));

    }
}
