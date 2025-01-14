package ru.job4j.tracker;
import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {

    }

    public Item(String name) {
        this.name = name;

    }
    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + id);
    }

    public static void main(String[] args) {
        Item first = new Item();
        first.printInfo();
        Item second = new Item("Biba");
        second.printInfo();
        Item third = new Item("Dony",22);
        third.printInfo();

    }
}