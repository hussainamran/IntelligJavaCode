package com.syntax.Reviewclass10;

import com.syntax.utils.ArraysUtil;

import java.util.ArrayList;

public class ListDemo3 {
    public static void main(String[] args) {
        int[] arr={10,23,3,5,34};
        ArrayList<Integer>arrayList = ArraysUtil.convertToArrayList(arr); //this how we convert array to arrayList
        System.out.println(arrayList);


    }
}
