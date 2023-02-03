package com.whp.threadmethod.cunrrentthread;

public class TestSubThread {
    public static void main(String[] args) throws InterruptedException {
        //创建子线程对象
        SubThread t2 = new SubThread();//main线程调用构造方法创建，mian
        t2.start();//启动线程，真正的创建出线程--Thread-0
        t2.setName("t2");//设置线程名为t2，此时会去执行run方法线程名已经被设置为t2
        Thread.sleep(500);
        Thread t3 = new Thread(t2);//通过传入Thread类的实例去创建线程
        t3.start();//正真的创建出了线程Thread-1,但是操作它的是传入的t2


    }
}
