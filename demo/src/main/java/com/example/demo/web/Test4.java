package com.example.demo.web;


/**
 * @author xiong
 */
public class Test4 {

    private volatile static int i = 0;
    private volatile static int second = 0;
    private volatile static int third = 0;


    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        ++i;
        if (second == 1) {
            synchronized (Test4.class){
                Test4.class.notifyAll();
            }
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        if (i != 1) {
            second = 1;
            synchronized (Test4.class){
                Test4.class.wait();
            }
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        ++i;
        if (third == 1) {
            synchronized (Test4.class){
                Test4.class.wait();
            }
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        if (i != 2) {
            third = 1;
            synchronized (Test4.class){
                Test4.class.wait();
            }
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
