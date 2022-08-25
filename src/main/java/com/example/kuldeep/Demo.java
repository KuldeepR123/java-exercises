package com.example.kuldeep;
class A{
    A(){
        System.out.println("Class a");
    }
}
class B extends A{
    B(){
        System.out.println("Class B");
    }
}
public class Demo {
    public static void main(String[] args) {
        new B();
    }
}
