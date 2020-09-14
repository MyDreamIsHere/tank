package com.example.demo.web;

/**
 * @author xiong
 */
public class WaitAndNotify {

    /**
     * 对象锁与类锁的区别
     */

    public Object o = new Object();

    public static void main(String[] args) throws Exception{
        new Thread(new Runnable() {
            @Override
            public void run() {
                new WaitAndNotify().waitTest();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                new WaitAndNotify().notifyTest();
            }
        }).start();

        Thread.sleep(4000);
        System.out.println("end");
    }

    public void waitTest(){
        try {
            synchronized (o){
                System.out.println(Thread.currentThread().getName()+"start");
                o.wait();
                System.out.println(Thread.currentThread().getName()+"end");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public void notifyTest(){
        try {
            synchronized (o){
                System.out.println(Thread.currentThread().getName()+"start");
                o.notifyAll();
                System.out.println(Thread.currentThread().getName()+"end");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
