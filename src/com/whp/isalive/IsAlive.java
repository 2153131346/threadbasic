package com.whp.isalive;

/**
 * @author Administrator
 */
public class IsAlive extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().isAlive());
    }
}
