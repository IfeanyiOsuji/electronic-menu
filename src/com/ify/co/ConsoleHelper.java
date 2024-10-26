package com.ify.co;

import com.ify.co.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {

    public static void writeMessage(String message){
        System.out.println(message);
    }
    public static String readString () throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String selectedDish = reader.readLine();
            return selectedDish;

    }
    public static List<Dish> getAllDishesForOrder() throws IOException{
        Dish [] dishes = Dish.values();
        List<Dish>selectedDishes = new ArrayList<>();
        while(true){
            writeMessage("Enter a dish from the menu or enter exit to finish");
            writeMessage(Dish.allDishesToString());
            String dishName = readString();
            if(dishName == null || dishName.equalsIgnoreCase("exit")){
                    break;
            }
            String selectedDish = "";
            for(Dish dish : dishes){
                if(dishName.equalsIgnoreCase(dish.toString())){
                    selectedDish = dish.toString();
                    selectedDishes.add(dish);
                }
            }
            if(!dishName.equalsIgnoreCase(selectedDish)){
                writeMessage("No such dish exists in the menu");
            }
        }
        return selectedDishes;
    }
}
