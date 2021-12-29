package com.syntax.class27;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo4 {
    public static void main(String[] args) {
        HashMap<Integer, String> building=new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "AMD");
        building.put(4, "Facebook");
        building.put(5, "Apple");
        building.put(6, "Microsoft");
        building.put(7, "NVIDIA");
        building.replace(4, "Meta");
        System.out.println(building);
        building.remove(7);
        System.out.println(building);

    }
}
