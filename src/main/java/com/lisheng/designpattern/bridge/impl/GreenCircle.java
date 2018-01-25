package com.lisheng.designpattern.bridge.impl;

import com.lisheng.designpattern.bridge.intf.DrawAPI;

public class GreenCircle implements DrawAPI {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius +", x: " +x+", "+ y +"]");
    }
}
