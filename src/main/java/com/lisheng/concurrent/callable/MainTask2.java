package com.lisheng.concurrent.callable;

import java.util.concurrent.*;

/**
 * Created by lisheng on 2017/6/3.
 */
public class MainTask2 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Long begin = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> future1 = executorService.submit(new Task1("Mary", countDownLatch));
        Future<String> future2 = executorService.submit(new Task2("Lisa", countDownLatch));
        executorService.shutdown();
        System.out.println("*------------------*");
        countDownLatch.await();
        System.out.println("result:"+future1.get() + ":" + future2.get() + " total costs:" + (System.currentTimeMillis()-begin) +"ms");

    }

}
