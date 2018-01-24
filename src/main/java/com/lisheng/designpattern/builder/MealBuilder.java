package com.lisheng.designpattern.builder;

import com.lisheng.designpattern.builder.item.ChickenBurger;
import com.lisheng.designpattern.builder.item.Coke;
import com.lisheng.designpattern.builder.item.Pepsi;
import com.lisheng.designpattern.builder.item.VegBurger;

/**
 * Created by lisheng on 2018/1/24.
 * 套餐
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
