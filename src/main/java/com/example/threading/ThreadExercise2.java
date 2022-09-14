package com.example.threading;
class Printing{
    boolean isOdd = false;
    public synchronized void oddNumber(int num){
        while(!isOdd){
            try{
                wait();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + num);
        isOdd = true;
        notify();
    }
    public synchronized void evenNumber(int num){
        while(isOdd){
            try{
                wait();
            }
            catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + num);
        isOdd = false;
        notify();
    }
}
class OddThread1 extends Thread {
    private boolean isOddNumber = false;
    private int max = 1000;
    Printing print;
    int number = isOddNumber ? 2 : 1;
    @Override
    public void run() {
        while(number<=max){
            if(isOddNumber){
                print.oddNumber(number);
            }
            number+=2;
        }
    }
}
class EvenThread1 implements Runnable{
    private boolean isEvenNumber = true;
    private int max = 1000;
    Printing print;
    int number = isEvenNumber ? 2 : 1;
    @Override
    public void run() {
        while(number<=max){
            if(isEvenNumber){
                print.evenNumber(number);
            }
            number+=2;
        }
    }
}
public class ThreadExercise2{
    static boolean value;
    static int number = 1;
    public static void main(String[] args) {
        Printing print = new Printing();
        OddThread oddThread = new OddThread("Odd Thread");
        EvenThread evenThread = new EvenThread();
        Thread t1 = new Thread(oddThread, "Even Thread");
        oddThread.start();
        t1.start();
    }
}