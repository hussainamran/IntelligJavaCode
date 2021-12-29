package com.syntax.class26;

import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("SDLC");
        linkedList.add("Menual Testing");
        linkedList.add("Java");
        linkedList.add("Git");
        linkedList.add("Selenium");
        linkedList.add("TestNG");
        System.out.println(linkedList);
        linkedList.set(1, "Python");
        System.out.println(linkedList);

    }
}
