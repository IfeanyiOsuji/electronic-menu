package com.ify.co.kitchen;

public enum Dish {
    Fish(25), Steak(30), Soup(15), Juice(5), Water(3);
    private final int duration;

    public int getDuration() {
        return duration;
    }

    Dish(int i) {
        this.duration = i;
    }

    public static String allDishesToString(){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< Dish.values().length; i++){
            builder.append(Dish.values()[i] +", ");
        }
        String list = builder.toString().trim();
        return list.substring(0,list.length()-1);
    }
}
