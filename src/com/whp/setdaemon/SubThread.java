package com.whp.setdaemon;

    public class SubThread implements Runnable{
        @Override
        public void run() {
            while (true){
                System.out.println("子线程-->");
            }
        }
    }
