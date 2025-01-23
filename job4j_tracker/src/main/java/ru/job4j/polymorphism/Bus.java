package ru.job4j.polymorphism;

import ru.job4j.cast.Vehicle;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " двигается по скоростным трассам.");
    }
    @Override
    public void canAfford() {
        System.out.println(getClass().getSimpleName() + " Казах может себе позволить.");
    }
}
