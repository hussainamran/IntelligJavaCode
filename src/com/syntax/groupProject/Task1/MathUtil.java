package com.syntax.groupProject.Task1;

public class MathUtil {
    public static double round(double value, int decimalpoint){
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);
        System.out.println(value);
        return value;
    }

}
