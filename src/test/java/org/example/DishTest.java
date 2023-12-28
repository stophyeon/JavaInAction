package org.example;

import org.example.Stream.Dish;
import org.example.Stream.DishType;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

class DishTest {

    @Test
    void main() {
        Dish dish1 = new Dish("beef",400, DishType.Meet);
        Dish dish2 = new Dish("pork",300, DishType.Meet);
        Dish dish3 = new Dish("french fries",200, DishType.Other);
        Dish dish4 = new Dish("hamburger",500, DishType.Other);
        Dish dish5 = new Dish("noodle",200, DishType.Other);
        Dish dish6 = new Dish("salad",100, DishType.Other);
        Dish dish7 = new Dish("fish cheap",100, DishType.Fish);
        List<Dish> dishes = new ArrayList<>();
        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);
        dishes.add(dish5);
        dishes.add(dish6);
        dishes.add(dish7);

        Map<DishType,List<Dish>> partitionDish = new HashMap<>();

//        for(Dish dish : dishes){
//            List<Dish> dishList = partitionDish.get(dish.dishType);
//            if(dishList == null){
//                dishList = new ArrayList<>();
//
//                partitionDish.put(dish.dishType,dishList);
//            }
//            dishList.add(dish);
//        }
//        System.out.println(partitionDish);
        Map<DishType,List<String>> streamDish=dishes.stream()
                .collect(Collectors.groupingBy(Dish::getDishType,mapping(Dish::getName,toList())));
        System.out.println(streamDish.get(DishType.Other));

        Map<Boolean,List<String>> streamDish2=dishes.stream()
                .collect(Collectors.partitioningBy(dish->dish.getCaloric()>=200,mapping(Dish::getName,toList())));
        System.out.println(streamDish2.get(true));
    }
}
