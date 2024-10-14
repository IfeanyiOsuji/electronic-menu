package com.ify.co.kitchen;

import com.ify.co.ConsoleHelper;
import com.ify.co.Tablet;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(final Tablet tablet) throws IOException{
        this.tablet = tablet;

        dishes = ConsoleHelper.getAllDishesForOrder();
    }

    @Override
    public String toString() {
        if(dishes.isEmpty()){
            return "";
        }
        return String.format("Your order: %s from %s", dishes.toString(), tablet.toString());
    }
}
