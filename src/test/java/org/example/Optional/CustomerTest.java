package org.example.Optional;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    @Test
    void main() {
        Insurance insurance = new Insurance("hanwha");
        Car car = new Car("1234",insurance);
        Customer customer = new Customer("john",car);

        Optional<Car> car1 = Optional.of(customer.getCar());
        System.out.println(car1.get().getCarNum());
    }



}