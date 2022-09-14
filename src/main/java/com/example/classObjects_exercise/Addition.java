package com.example.classObjects_exercise;

public class Addition extends ArithmeticOperation {
    @Override
    void perform(int x, int y) {
        System.out.println("Addition of two numbers are : " + (x + y));
    }
}
