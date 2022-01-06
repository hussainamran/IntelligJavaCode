package com.syntax.class31HomeWork;

import java.util.Scanner;

public class Task1 {
        /*
        Create a method to check age eligibility that will throw a runtime exception.
        Method should throw an exception age is less than 16.
         */

        public static void validate(int age) {
            if(age<16) {
                //throw Arithmetic exception if not eligible to vote
                throw new ArithmeticException("Person is not eligible to vote");
            }
            else {
                System.out.println("Person is eligible to vote!!");
            }
        }
        //main method
        public static void main(String args[]){
            //calling the function
            validate(15);
            System.out.println("rest of the code...");
        }


    }
