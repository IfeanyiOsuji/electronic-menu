package com.ify.co;

import com.ify.co.kitchen.Cook;
import com.ify.co.kitchen.Waiter;

public class Restaurant {

    public static void main(String[] args) {
        Tablet tablet = new Tablet(4);

        Cook cook = new Cook("Ifeco");
        Waiter waiter = new Waiter();
        tablet.addObserver(cook);

        cook.addObserver(waiter);
        tablet.createOrder();
       // tablet.createOrder();
        //tablet.createOrder();
       // tablet.createOrder();
    }
}
