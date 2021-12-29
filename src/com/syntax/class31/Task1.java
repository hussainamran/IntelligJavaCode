package com.syntax.class31;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.
         */
        Scanner scanner=new Scanner(System.in);

       try{
           System.out.println("Please enter your age!");
           int number=scanner.nextInt();
       }catch (InputMismatchException e){
           System.out.println("Only numbers are allowed");
       }
    }
}
