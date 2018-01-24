package com.lisheng.designpattern.abstractfactory.main;

import com.lisheng.designpattern.abstractfactory.intf.Color;
import com.lisheng.designpattern.factory.intf.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
