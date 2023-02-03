package com.whp.interrupt;

public class SubThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程" + i);
        }
    }
}
