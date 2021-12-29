package com.syntax.class22;

public class Father {
    String name;
    Father(String name){
        this.name=name;
    }
    void sleep(){
        //just a system print msg
        System.out.println(name+" like you sleep 8 hours");
    }
    void eat(){
        System.out.println(name+" like to eat Veggie");
    }
}
