package com.whp.threadmethod.cunrrentthread;

public class SubThread extends Thread {
    public SubThread() {
        System.out.println("构造方法中Thread.currentThread().getName()" + Thread.currentThread().getName());
        System.out.println("构造方法,this.getName()" + this.getName());
    }

    @Override
    public void run() {
        System.out.println("run方法中Thread.currentThread().getName()" + Thread.currentThread().getName());
        System.out.println("run方法中,this.getName()" + this.getName());
    }
}
