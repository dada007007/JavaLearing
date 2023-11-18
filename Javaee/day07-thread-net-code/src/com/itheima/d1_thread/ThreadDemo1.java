package com.itheima.d1_thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
        Thread myThread2 = new MyThread2();
        myThread2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程进程："+i);
        }
    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程1进程："+i);
            }
        }
    }
    static class MyThread2 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("子线程2进程："+i);
            }
        }
    }
}


