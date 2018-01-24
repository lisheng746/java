package com.lisheng.designpattern.abstractfactory.impl;

import com.lisheng.designpattern.abstractfactory.intf.Color;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}