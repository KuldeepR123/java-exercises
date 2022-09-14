package com.examples.threading;

public class Volatile {
    public static void main(String[] args) throws InterruptedException {
        VolatileKeyword volatileKeyword = new VolatileKeyword();
        Thread t1 = new Thread(volatileKeyword);
        t1.start();
        Thread t2 = new Thread(volatileKeyword);
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Number -> " + volatileKeyword.getNumber());
    }
}
