package com.syntax.class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo5 {
    public static void main(String[] args) throws IOException {

        // This how we read the data

        //Raaltive path to the file always preferred
        String path="Files/config.properties";

        //Reading the data in the from of raw bytes in the java program
        /*
        we should always load the data in the java program before we write the new data to that file using fileoutputstream to
        avoide losing any data
         */
        FileInputStream fileInputStream=new FileInputStream(path);

        //read the raw data
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("password"));
        properties.setProperty("Server","Development");

        //This how we write the data

        properties.setProperty("URL","www.google.com");
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"Added new Property Dev");


    }
}
