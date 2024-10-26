package com.ify.co;

import com.ify.co.kitchen.Order;

import java.io.IOException;
import java.util.Observable;

import java.util.logging.Logger;

public class Tablet  extends Observable {
    private final int number;
    private Logger logger = Logger.getLogger(Tablet.class.getName());


    public Tablet(final  int number){
        this.number = number;
    }

    public Order createOrder(){
            Order order = null;
            try {
                order = new Order(this);
                setChanged();
                if(!order.isEmpty()) {
                    notifyObservers(order);
                }
            }catch (IOException ex){
                logger.severe("The console is unavailable." );
            }
    return order;

    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
