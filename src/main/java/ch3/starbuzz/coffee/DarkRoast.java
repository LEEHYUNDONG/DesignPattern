package ch3.starbuzz.coffee;

import ch3.starbuzz.beverage.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("Dark Roast Coffee");
    }

    public double cost() {
        return .89;
    }
}
