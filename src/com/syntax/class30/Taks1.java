package com.syntax.class30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;


public class Taks1 {
    public static void main(String[] args) throws IOException {
        String path="Files/registeration.properties";

        FileInputStream fileInputStream=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fileInputStream);
        System.out.println("browser "+properties.getProperty("browser"));
        System.out.println("url " +properties.getProperty("url"));

    }
}