package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Автобус едет с города Алматы в город Конаев.");
    }

    @Override
    public void passengers(int count) {
        System.out.println("В автобусе " + count + " посажиров.");
    }

    @Override
    public int refuel(int fuel) {
        int price = 300;
        return fuel * price;
    }

    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.move();
        bus.passengers(25);
        System.out.println("Цена за заправку " + bus.refuel(50) + " тенге.");
    }
}
