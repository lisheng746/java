package com.lisheng.concurrent.lockdemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lisheng on 2017/6/5.
 */
public class ReentrantLockTest implements Runnable {

    private String name;

    private Lock lock = new ReentrantLock();

    public ReentrantLockTest(String name){
        this.name = name;
    }

    public void run(){
        lock.lock();

        try{
            System.out.println(name);
        } finally {
            lock.unlock();
        }
    }

}
