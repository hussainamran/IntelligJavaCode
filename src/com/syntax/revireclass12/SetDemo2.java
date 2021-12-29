package com.syntax.revireclass12;

import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> hasset=new HashSet<>();
        hasset.add(10);
        hasset.add(20);
        hasset.add(30);
        hasset.add(30);
        hasset.removeIf(x-> x>10);//lamaa dax
        System.out.println(hasset);
    }
}
