package com.whp.creatthread.p1;

/**
 * @author Administrator
 */
public class MyThread extends Thread{

    //重写Thread父类中的run()方法
    //run()方法体中的代码就是子线程要执行的任务
    @Override
    public void run() {
        System.out.println("这是子线程打印的内容！");

    }
}
