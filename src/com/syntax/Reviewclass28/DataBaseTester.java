package com.syntax.Reviewclass28;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new GoogleDatabase(10);
        dataBase.openDataBase();
        dataBase.readData();
        dataBase.editData();
        dataBase.closeDataBase();
    }
}
