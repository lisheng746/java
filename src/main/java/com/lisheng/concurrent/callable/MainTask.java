package com.lisheng.concurrent.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by lisheng on 2017/6/3.
 */
public class MainTask {

    public static void main(String[] args) throws InterruptedException, ExecutionException{

        long begin = System.currentTimeMillis();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorService.submit(new Task1("Mike"));
        Future<String> future2 = executorService.submit(new Task2("Jack"));
        executorService.shutdown();

        System.out.println("*------------------------*");
        while (!executorService.isTerminated()){
            Thread.sleep(100);
        }

        System.out.println("result:"+future1.get() + ":" + future2.get() + " total costs:" + (System.currentTimeMillis()-begin) +"ms");

    }

}
