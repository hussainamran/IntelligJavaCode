package com.syntax.class31HomeWork;

import java.util.Scanner;

public class Task2 {
        /*
        Create a method checkUserName that will throw a runtime exception.
        Method should throw an exception when entered username is less than 5 characters.
        */
        public static void checkusername(String username){
            if(username.length()<5){
                throw new RuntimeException("user name can not be less then 5 character");
                }else{
                System.out.println("Your user name is correct");

                }
            }

    public static void main(String[] args) {
        try{
            checkusername("admi");
        }catch ( Exception e){
            e.printStackTrace();
        }
    }

        }



