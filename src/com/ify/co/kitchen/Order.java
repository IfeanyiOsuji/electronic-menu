package com.ify.co.kitchen;

import com.ify.co.Tablet;

import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order(final Tablet tablet){
        this.tablet = tablet;
    }
}
