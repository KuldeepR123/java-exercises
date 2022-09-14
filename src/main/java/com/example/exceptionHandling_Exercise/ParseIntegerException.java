package com.example.exceptionHandling_Exercise;

public class ParseIntegerException extends Exception {
    public String toString() {
        return "Invalid Elasticsearch port configuration";
    }
}
