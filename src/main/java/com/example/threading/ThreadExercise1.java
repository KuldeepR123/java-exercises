package com.example.threading;
class OddThread extends Thread {
    public OddThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " --> " +  i);
            }
        }
    }
}
class EvenThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0 && i!=0) {
                System.out.println(Thread.currentThread().getName() + " --> " +  i);
            }
        }
    }
}
public class ThreadExercise1{
    public static void main(String[] args) {
        OddThread oddThread = new OddThread("Odd Thread");
        EvenThread evenThread = new EvenThread();
        Thread thread = new Thread(evenThread, "Even Thread");
        oddThread.start();
        thread.start();
    }
}