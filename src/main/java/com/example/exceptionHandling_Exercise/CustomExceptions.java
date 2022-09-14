package com.example.exceptionHandling_Exercise;

public class CustomExceptions extends Exception {
    public CustomExceptions() {
        super("Invalid Elastic Search Configuration");
    }

    public CustomExceptions(String strMessage) {
        super(strMessage);
    }
}
