package com.example.classObjects_exercise;

public class Multiplication extends ArithmeticOperation {
    @Override
    void perform(int x, int y) {
        System.out.println("Multiplication of two numbers are : " + (x * y));
    }
}
