package com.syntax.groupProject.Task1.Task5;

import java.util.Locale;

public class Registration {
    /*
    Create Registration Class in which you would have variables as email, userName and password that have an
    access scope only within its own class. After creating an object of the class user should be able to call
    methods and in each method separately pass values to set users email, username and password.
    Requirements: Valid email consider to be only yahoo
    Valid userName and password cannot be empty and should be of length larger than 6 characters.
    Also valid password cannot contain userName.
     */
    private String email;
    private String userName;
    private String password;

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        if (email.contains("yahoo")) {
            System.out.println("valid email address entered");
        } else {
            System.out.println("Invalid email address please enter valid yahoo email");
        }
    }

    private String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        boolean isEmpty;
        if (userName.isEmpty()) {
            System.out.println("Username field can not be empty");
        } else if (userName.length() < 6) {
            System.out.println("User name field must be 8 character long");
        } else if (userName.length() > 16) {
            System.out.println("User name must be 16 character or less");
        } else {
            System.out.println("Valid userName enter");
        }
    }

    private String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if (password.isEmpty()) {
            System.out.println("Password field can not be empty");
        } else if (password.length() < 6) {
            System.out.println("Password field must be 8 character long");
        } else if (password.length() > 16) {
            System.out.println("Password field must be less then 16 character long");
        }else {
            System.out.println("Valid password enter");
        }
    }
}
