package com.lisheng.jvm;

/**
 * Created by lisheng on 2018/1/29.
 */
public class SimpleHeap {
    private int id;
    public SimpleHeap(int id){
        this.id = id;
    }
    public void show(){
        System.out.println("my id is" + id);
    }

    public static void main(String[] args) {
        // SimpleHeap 实例本身存放在堆中
        // 描述SimpleHeap类的信息存放在方法区
        // main()函数中s1和s2局部变量存放在Java栈中，并指向堆中的两个实例
        SimpleHeap s1 = new SimpleHeap(1);
        SimpleHeap s2 = new SimpleHeap(2);
        s1.show();
        s2.show();
    }
}
