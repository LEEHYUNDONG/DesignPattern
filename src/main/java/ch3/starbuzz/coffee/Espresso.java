package ch3.starbuzz.coffee;

import ch3.starbuzz.beverage.Beverage;

public class Espresso extends Beverage {
    String description;

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
