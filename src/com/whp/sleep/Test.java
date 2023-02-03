package com.whp.sleep;

/**
 * @author Administrator
 */
public class Test {
    public static void main(String[] args) {
        int timer =10 ;
        while (true){
            System.out.println("timer" + timer);
            timer--;
            if (timer<0){
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("计时结束");
        System.out.println(4&7);
    }
}
