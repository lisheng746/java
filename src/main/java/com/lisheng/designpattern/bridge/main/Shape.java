package com.lisheng.designpattern.bridge.main;

import com.lisheng.designpattern.bridge.intf.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
