package com.syntax.class27;

import java.util.LinkedHashMap;

public class HashMapDemo3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String>students=new LinkedHashMap<>();
        students.put(10,"Amran");
        students.put(20,"Amran");
        students.put(12,"Azhar");
        students.put(23,"Jabed");
        System.out.println(students);
        students.replace(10,"Hussain");
        System.out.println(students);

    }
}
