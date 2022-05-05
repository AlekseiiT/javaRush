package com.company.lecture16.task20;

public class Thread4 extends Thread implements Message{
    @Override
    public void run() {
        while (!isInterrupted()){}
    }

    @Override
    public void showWarning() {
        interrupt();
    }
}
