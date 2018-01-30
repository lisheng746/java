package com.lisheng.jvm;

import sun.nio.ch.DirectBuffer;

import java.nio.ByteBuffer;

/**
 * Created by lisheng on 2018/1/29.
 * 直接申请堆外内存，并手动释放
 */
public class NonHeapTest {

    public static void clean(final ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            ((DirectBuffer) byteBuffer).cleaner().clean();
        }
    }

    public static void sleep(long i) {
        try {
            Thread.sleep(i);
        } catch (Exception e) {
              /*skip*/
        }
    }

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 1024 * 500);
        System.out.println("start");
        sleep(5000);
        clean(buffer);//执行垃圾回收
//         System.gc();//执行Full gc进行垃圾回收
        System.out.println("end");
        sleep(5000);
    }
}
