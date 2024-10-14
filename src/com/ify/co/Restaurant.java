package com.ify.co;

import com.ify.co.kitchen.Cook;

public class Restaurant {

    public static void main(String[] args) {
        Tablet tablet = new Tablet(4);
        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
        tablet.createOrder();
        Cook cook = new Cook("Ifeco");
        tablet.addObserver(cook);
    }
}
