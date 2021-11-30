package com.syntax.class241;

public interface Driveable {
    void drive();
}
class Bike implements Driveable{
    @Override
    public void drive() {
        System.out.println("Driving a bike");
    }
}
class Car implements Driveable{
    @Override
    public void drive() {
        System.out.println("Driving a car");
    }
}
