package com.example.kitchenadventures;

import java.util.List;

public class Restaurant {
    private String description;
    private String name;
    private int value;

    public Restaurant(String name, String description, int value){
        this.name = name;
        this.description = description;
        this.value = value;

    }

    public static final Restaurant[] restaurants = {
            new Restaurant("In n' Out", "In n' Out sells American food such as burgers, fries, and shakes.", 0),
            new Restaurant("Panda Express", "Panda Express sells Chinese fast food such as Orange Chicken, Chow Mein, and Spring Rolls.", 1),
            new Restaurant("El Pollo Loco", "Subway sells sandwiches cutomized by you!", 2),
            new Restaurant("Pizza Hut", "Pizza Hut sells pizza.", 3),
            new Restaurant("Briganti", "Briganti sells quality Italian food such as pasta, pizza, and more.", 4)
    };
}


