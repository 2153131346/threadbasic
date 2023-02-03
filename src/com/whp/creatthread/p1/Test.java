package com.whp.creatthread.p1;

public class Test {
    public static void main(String[] args) {
        System.out.println("JVM启动main线程，main线程打印的内容！");
        //创建子线程
        MyThread myThread = new MyThread();
        //启动子线程，但是 并不意味线程开始执行，而是告诉JVM这个线程准备好被执行了
        myThread.start();

        /**
         * 调用线程的start方法来启动线程，启动线程的实质就是请求JVM运行相应的线程，
         * 这个线程具体什么时候运行由线程调度器（Scheduler）决定
         * 注意：
         *      start()方法调用结束并不意味着子线程开始运行，而是准备好了被运行
         *      新开启的线程会执行run()方法
         *      如果开启了多个线程，start()调用的顺序并不一定就是线程启动的顺序
         */

        System.out.println("main线程后的其他代码！");

    }
}
