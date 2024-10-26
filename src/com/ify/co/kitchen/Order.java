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
    public int getTotalCookingTime(){
        int time = 0;
        for(Dish dish : dishes){
            time+= dish.getDuration();
        }
        return  time;
    }
    public boolean isEmpty(){
        return  dishes.isEmpty();
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "";
        }
        return String.format("Your order: %s from %s, cooking time %d min", dishes.toString(), tablet.toString(), getTotalCookingTime());
    }
}
