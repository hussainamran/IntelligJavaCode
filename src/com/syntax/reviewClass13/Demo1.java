package com.syntax.reviewClass13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) {
        String path="sjbfsjfbdjf";
        try{
            FileInputStream fileInputStream=new FileInputStream(path);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
