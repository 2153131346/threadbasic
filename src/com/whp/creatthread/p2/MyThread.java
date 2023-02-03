package com.whp.creatthread.p2;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("这是子线程" + i);
                int time = (int) (Math.random()*1000);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
