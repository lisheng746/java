package com.lisheng.dp.singleton.main;

/**
 * Created by lisheng on 2018/1/24.
 * 饿汉式，线程安全
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    //获取唯一可用的对象
    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
