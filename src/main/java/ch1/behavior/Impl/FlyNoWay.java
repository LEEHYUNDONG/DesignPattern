package ch1.behavior.Impl;

import ch1.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
