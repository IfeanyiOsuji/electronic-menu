package com.ify.co.kitchen;

import com.ify.co.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Cook implements Observer {
    private String name;

    public Cook(final String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void update(Observable observable, Object o) {
        ConsoleHelper.writeMessage("Start cooking - " + o);
    }
}
