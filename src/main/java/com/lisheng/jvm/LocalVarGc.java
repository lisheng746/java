package com.lisheng.jvm;

/**
 * Created by lisheng on 2018/1/31.
 * 启动参数配置：-XX:+PrintGC
 * 查看局部变量是否gc掉
 */
public class LocalVarGc {
    public void localVarGc1(){
        byte[] a = new byte[6 * 1024 * 1024];
        System.gc();
    }

    public void localVarGc2(){
        byte[] a = new byte[6 * 1024 * 1024];
        a = null;
        System.gc();
    }

    public void localVarGc3(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localVarGc4(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        int c=10;
        System.gc();
    }

    public void localVarGc5(){
        localVarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGc ins = new LocalVarGc();
        System.out.println("1:");
        ins.localVarGc1();
        System.out.println("2:");
        ins.localVarGc2();
        System.out.println("3:");
        ins.localVarGc3();
        System.out.println("4:");
        ins.localVarGc4();
        System.out.println("5:");
        ins.localVarGc5();


    }
}
