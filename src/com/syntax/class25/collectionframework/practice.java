package com.syntax.class25.collectionframework;

public class practice {
    public static void main(String[] args) {
        String[]names={"Amran","Hussain"};
        int[]arr={12,12,34,54};
        for(String ns:names){
            //System.out.println(ns.startsWith("A"));
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        }

    }

