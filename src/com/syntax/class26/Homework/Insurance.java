package com.syntax.class26.Homework;

public abstract class Insurance {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote
    and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own
    attribute as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String carModel, String insuranceName){
        super(insuranceName);
        this.carModel=carModel;
        }
        @Override
    public void getQuote() {
        System.out.println("Get a quote for car " +carModel+ " from " +insuranceName);
    }
    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance for "+carModel+ "from "+insuranceName);
    }
}

class Pet extends Insurance{
String petType;
Pet(String petType, String insuranceName){
    super(insuranceName);
    this.petType=petType;
}

    @Override
    public void getQuote() {
        System.out.println("Get a quote for car " +petType+ " from " +insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance for "+petType+ "from "+insuranceName);
    }
}
class Health extends Insurance{
Health(String insuranceName){
    super(insuranceName);
}

    @Override
    public void getQuote() {
        System.out.println("Get a quote "+insuranceName);
    }

    @Override
    public void cancelInsurance() {
        System.out.println("Cancel the insurance from "+insuranceName);
    }
}