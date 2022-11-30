package ch3.starbuzz.condiment;


import ch3.starbuzz.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;

    public abstract String getDescription();
}
