package com.whp.interrupt;

/**
 * @author Administrator
 */
public class Test2 {
    public static void main(String[] args) {
        SubThread2 subThread2 = new SubThread2();
        Thread thread = new Thread(subThread2);
        thread.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程" + i);
        }
        thread.interrupt();//停止子线程，只是一个停止标志，不会真的停止
    }
}
