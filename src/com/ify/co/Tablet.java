package com.ify.co;

import com.ify.co.kitchen.Order;

import java.io.IOException;
import java.util.logging.Logger;

public class Tablet {
    private final int number;
    private Logger logger = Logger.getLogger(Tablet.class.getName());
    public Tablet(final  int number){
        this.number = number;
    }

    public void createOrder(){
            try {
                Order order = new Order(this);
            }catch (IOException ex){
                logger.severe("The console is unavailable." );
            }

    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}
