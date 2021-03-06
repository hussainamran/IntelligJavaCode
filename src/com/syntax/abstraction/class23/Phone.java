package com.syntax.abstraction.class23;

public abstract class Phone {
    void makePhoneCalls(){
        System.out.println("Making a call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPictures();
    abstract void unlockPhone();
}
class Iphone extends Phone{
    @Override
    void displayPictures() {
        System.out.println("Iphone uses photos app to display the pictures ");
    }

    @Override
    void unlockPhone() {
        System.out.println("Use faceID to unlock to the phone ");
    }
}
class Samsung extends Phone{
    @Override
    void unlockPhone() {
        System.out.println("Use fingerprint sensor to unlock the phone");
    }

    @Override
    void displayPictures() {
        System.out.println("Use gallery app to view picture");
    }
}