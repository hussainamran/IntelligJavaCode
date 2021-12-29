package com.syntax.class31;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        try {
            Account.withdraw(-12);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }
    }
}
