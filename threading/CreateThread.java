package com.examples.threading;

import java.util.concurrent.TimeUnit;

class NewThread extends Thread{
    @Override
    public void run() {
        System.out.println("Starting Process");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished Process");
    }
}
public class CreateThread {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            new NewThread().start();
        }
    }
}
