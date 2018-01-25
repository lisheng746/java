package com.lisheng.dp.bridge.main;

import com.lisheng.dp.bridge.impl.GreenCircle;
import com.lisheng.dp.bridge.impl.RedCircle;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
