package com.lisheng.dp.abstractfactory.main;

import com.lisheng.dp.abstractfactory.intf.Color;
import com.lisheng.dp.factory.intf.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
