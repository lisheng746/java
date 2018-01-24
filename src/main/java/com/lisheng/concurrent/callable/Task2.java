package com.lisheng.concurrent.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/**
 * Created by lisheng on 2017/6/3.
 */
public class Task2 implements Callable<String> {

    private String name;
    private CountDownLatch countDownLatch;

    public Task2(String name){
        this.name = name;
    }

    public Task2(String name, CountDownLatch countDownLatch){
        this(name);
        this.countDownLatch = countDownLatch;
    }

    public String call() throws Exception {

        long begin = System.currentTimeMillis();
        System.out.println(name + " begins...");
        Thread.sleep(300);

        System.out.println(name + " ends...");
        System.out.println(name + " costs:" + (System.currentTimeMillis()-begin) + "ms");

        if(this.countDownLatch != null){
            this.countDownLatch.countDown();
        }

        return "Task2 done!";
    }
}
