package com.syntax.class27;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        HashMap<String, Integer>fruit=new HashMap<>();
        fruit.put("Apple",10);
        fruit.put("Mango",15);
        fruit.put("Orange",20);
        fruit.put("Kiwi",18);
        fruit.put("Apricot",50);
        System.out.println(fruit.get("Kiwi"));
        System.out.println(fruit.remove("Orange"));
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Cow"));
        System.out.println(fruit.containsKey("Mango"));
        System.out.println(fruit.containsValue(100));
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.replace("Mango",35));
        System.out.println(fruit);
    }
}
