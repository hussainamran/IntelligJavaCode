package com.syntax.class18Homework;

public class Task1 {
    /*
    Write program for multilevel inheritance where class A inherited by B and class B inherit class by C.
     */
    public static void main(String[] args) {
        C b = new C();

    }
}

class A {
    public A() {
        System.out.println("A");
    }
}

class B extends A {
    public B() {
        System.out.println("B");
    }
}

class C extends B {
    public C() {
        System.out.println("C");
    }
}
