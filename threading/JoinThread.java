package com.examples.threading;

class D1 extends Thread{
    @Override
    public synchronized void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " -> "+ i);
        }
    }
}
class D2 extends Thread{
    @Override
    public synchronized void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " -> "+ i);
        }
    }
}
public class JoinThread {
    public static void main(String[] args) throws Exception{
        D1 d1 = new D1();
        d1.start();
        D2 d2 = new D2();
        d2.start();

        d1.join();
        d2.join();
        System.out.println("Hello , this is main method thread");
    }
}
