package com.lisheng.dp.abstractfactory.main;

import com.lisheng.dp.abstractfactory.impl.Blue;
import com.lisheng.dp.abstractfactory.impl.Green;
import com.lisheng.dp.abstractfactory.impl.Red;
import com.lisheng.dp.abstractfactory.intf.Color;
import com.lisheng.dp.factory.intf.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
