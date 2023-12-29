package org.example.Optional;

public class Customer {
    private final String name;
    private final Car car;
    public Customer(String name,Car car){
        this.name=name;
        this.car=car;
    }

    public Car getCar() {
        return car;
    }

    public String getName() {
        return name;
    }
}
