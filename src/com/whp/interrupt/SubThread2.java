package com.whp.interrupt;

public class SubThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("子线程" + i);
            if (Thread.interrupted()){
                System.out.println("停止标志为true我要停止了");
                return;
            }
        }
    }
}
