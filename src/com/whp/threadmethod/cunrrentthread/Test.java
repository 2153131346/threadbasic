package com.whp.threadmethod.cunrrentthread;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        CurrentMethod currentMethod = new CurrentMethod();
        Thread thread = new Thread(currentMethod);
//        thread.start();
        thread.run();
        System.out.println("main线程打印线程名称" + Thread.currentThread().getName());
    }
}