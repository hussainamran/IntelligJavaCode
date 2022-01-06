package com.syntax.peactice;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[]grades=new int [10];
        for (int i = 0; i < grades.length; i++) {
            int x=scanner.nextInt();
            grades[i]=x;
        }
        System.out.println(Arrays.toString(grades));
    }
}