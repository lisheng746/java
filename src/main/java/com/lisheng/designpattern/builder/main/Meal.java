package com.lisheng.designpattern.builder.main;

import com.lisheng.designpattern.builder.intf.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lisheng on 2018/1/24.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }
}
