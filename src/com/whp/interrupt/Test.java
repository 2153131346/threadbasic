package com.whp.interrupt;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        SubThread1 subThread1 = new SubThread1();
        Thread thread = new Thread(subThread1);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }
        thread.interrupt();//停止子线程，只是一个停止标志，不会真的停止
    }
}
