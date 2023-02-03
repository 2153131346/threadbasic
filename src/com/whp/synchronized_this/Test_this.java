package com.whp.synchronized_this;

import java.util.HashMap;

/**
 * @author Administrator
 * synchronized同步代码块
 * 使用this当前对象作为锁对象来保证线程同步
 */
public class Test_this {
    public static void main(String[] args) {
        Test_this obj = new Test_this();
        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.mm();//使用的锁对象this就是obj对象
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                obj.mm();//使用的锁对象this就是obj对象
            }
        }).start();

    }
    public void mm(){
        synchronized (this){        //经常使用this当前对象作为锁对象
            for (int i = 1; i <=100 ; i++) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
            }
        }

    }
}
