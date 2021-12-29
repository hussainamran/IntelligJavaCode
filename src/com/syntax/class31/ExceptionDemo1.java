package com.syntax.class31;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        String name=null;
        System.out.println("line 1");
        try{
            int number1=10;
            int number2=20;
            System.out.println(number1/number2);
            System.out.println(name.length());
        }catch (NullPointerException e){//nullpointrt issue
            System.out.println("Sending a massase it's not working");
        }catch(ArithmeticException e){// incase index issue
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Something is went wrong");
        }
        System.out.println("line 2");
    }
}
