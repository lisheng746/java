package com.lisheng.dp.prototype.main;

import com.lisheng.dp.prototype.shape.Shape;

/**
 * Created by lisheng on 2018/1/24.
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("1");
        Shape clonedShape2 = ShapeCache.getShape("2");
        Shape clonedShape3 = ShapeCache.getShape("3");

        System.out.println("Shape : " + clonedShape1.getType());
        System.out.println("Shape : " + clonedShape2.getType());
        System.out.println("Shape : " + clonedShape3.getType());
    }
}
