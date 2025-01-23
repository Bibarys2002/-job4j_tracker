package ru.job4j.cast;

import ru.job4j.polymorphism.Bus;

public class TransportMove {
    public static void main(String[] args) {
        Vehicle plain = new Plain();
        Vehicle train = new Train();
        Vehicle bus = new Bus();


        Vehicle[] vehicle = new Vehicle[]{plain, train, bus};
        for (Vehicle object : vehicle) {
            object.move();
            object.canAfford();
        }
    }
}
