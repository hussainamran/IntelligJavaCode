package com.syntax.Reviewclass28;

public interface Drawable {
    int paperSize=12;
    void draw();
    static void staticMethod(){
        System.out.println("I am static method inside interface");
    }
}
class Rectangle implements Drawable{
    @Override
    public void draw() {
        System.out.println("I am drawing a rectangle");
    }
}
