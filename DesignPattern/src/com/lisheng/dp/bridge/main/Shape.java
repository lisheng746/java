package com.lisheng.dp.bridge.main;

import com.lisheng.dp.bridge.intf.DrawAPI;

public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
