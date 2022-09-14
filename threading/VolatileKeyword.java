package com.examples.threading;

public class VolatileKeyword implements Runnable{
    private volatile int number = 0;
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            number++;
        }
    }
    public  int getNumber(){
        return number;
    }
}
