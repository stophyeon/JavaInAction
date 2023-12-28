package org.example.Stream;

public class Dish {
    public String name;
    public int caloric;
    public DishType dishType;

    public Dish(String name, int caloric, DishType dishType) {
        this.name = name;
        this.caloric = caloric;
        this.dishType = dishType;
    }

    public String getName() {
        return name;
    }

    public int getCaloric() {
        return caloric;
    }

    public DishType getDishType() {
        return dishType;
    }
}
