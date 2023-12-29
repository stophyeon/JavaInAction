package org.example.Optional;

public class Car {
    private final String carNum;
    private final Insurance insurance;

    public Car(String carNum,Insurance insurance){
        this.carNum=carNum;
        this.insurance=insurance;
    }

    public String getCarNum() {
        return carNum;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}
