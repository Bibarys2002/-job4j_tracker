package ru.job4j.cast;

public class Plain implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летает в небе.");
    }

    @Override
    public void canAfford() {
        System.out.println(getClass().getSimpleName() + " Американец может себе позволить.");
    }
}
