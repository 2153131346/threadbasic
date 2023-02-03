package com.whp.isalive;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        IsAlive thread = new IsAlive();
        System.out.println(thread.isAlive());
        thread.start();
        System.out.println(thread.isAlive());
    }
}
