package com.lisheng.jvm;

/**
 * Created by lisheng on 2018/1/31.
 * 栈的最大调用深度 -Xss512k
 */
public class TestStackDeep {

    private static int count = 0;

    /**
     * 局部变量较多，局部变量表膨胀，导致更浅的函数调用深度
     * @param a
     * @param b
     * @param c
     */
    private static void recursion(long a, long b, long c){
        long e=1,f=2,g=3,h=4,i=5,k=6,q=7,x=8,y=9,z=10;
        count ++;
        recursion(a,b,c);
    }

    private static void recursion() {
        count++;
        recursion();
    }

    public static void main(String[] args) {
        try {
//            recursion();
            recursion(0L, 0L, 0L);
        } catch (Throwable t){
            System.out.println("deep of calling:" + count);
            t.printStackTrace();
        }
    }

}
