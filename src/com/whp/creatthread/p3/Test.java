package com.whp.creatthread.p3;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        //利用Thread类的有参构造，传入Runnable实例
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("这是main线程" + i);
        }

        //匿名内部类的方式实现
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("这是子线程2-" + i);
                }
            }
        });
        thread2.start();
    }
}
