package com.ify.co.kitchen;

public enum Dish {
    Fish, Steak, Soup, Juice, Water;

    public static String allDishesToString(){
        StringBuilder builder = new StringBuilder();
        for(int i=0; i< Dish.values().length; i++){
            builder.append(Dish.values()[i] +", ");
        }
        String list = builder.toString().trim();
        return list.substring(0,list.length()-1);
    }
}
