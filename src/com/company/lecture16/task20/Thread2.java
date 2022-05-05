package com.company.lecture16.task20;

public class Thread2 extends Thread{
    @Override
    public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
