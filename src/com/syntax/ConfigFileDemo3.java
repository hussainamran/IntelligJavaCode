package com.syntax;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo3 {
    public static void main(String[] args) throws IOException {
        //location of the file inside our project
        String path="Files/Trump.properties";

        //creating the object of the properties
        Properties properties=new Properties();

        //adding new properties to the object
        properties.put("UserName", "Amran123");
        properties.put("Password","pass123");

       FileOutputStream fileOutputStream=new FileOutputStream(path);
        properties.store(fileOutputStream,"Creating a new file");

        fileOutputStream.close();
    }
}
