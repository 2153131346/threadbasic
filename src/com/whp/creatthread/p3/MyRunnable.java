package com.whp.creatthread.p3;

/**
 * @author Administrator
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("这是子线程1-" + i);
        }
    }
}
