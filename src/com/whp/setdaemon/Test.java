package com.whp.setdaemon;

public class Test {
    public static void main(String[] args) {
        SubThread subThread = new SubThread();
        Thread thread = new Thread(subThread);
        thread.setDaemon(true);//在启动线程之前设置其为守护线程，若在启动之后设置不会生效
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main" + i);

        }
    }
}
