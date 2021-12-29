package com.syntax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo2 {
    public static void main(String[] args) throws IOException {

        //location of the file inside our project
        String path="C:\\Users\\Amran\\config.properties";

        //creating a connection to that file use read the data
        FileInputStream fileInputStream=new FileInputStream(path);

        //that special program that will help use read data
        Properties properties=new Properties();

        //loading the data inside properties object from the file
        properties.load(fileInputStream);

        //getting the value for corresponding keys
        System.out.println(properties.get("UserName"));
    }
}
