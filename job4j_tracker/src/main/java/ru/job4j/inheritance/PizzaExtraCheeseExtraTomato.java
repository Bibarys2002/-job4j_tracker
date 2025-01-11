package ru.job4j.inheritance;

public class PizzaExtraCheeseExtraTomato extends PizzaExtraCheese {
    private static final String ExtraTomato = " + Extra Tomato";
    public PizzaExtraCheeseExtraTomato(String name) {
        super(name);

    }
    @Override
    public String name() {
        return super.name() + ExtraTomato;
    }
    public static void main(String[] args) {
        PizzaExtraCheeseExtraTomato Pizza= new PizzaExtraCheeseExtraTomato("Pizza");
        System.out.println(Pizza.name());
    }
}
