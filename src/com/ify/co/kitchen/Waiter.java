package com.ify.co.kitchen;

import com.ify.co.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer {


    @Override
    public void update(Observable observable, Object o) {
        ConsoleHelper.writeMessage(o + " was prepared by " + observable);
    }
}
