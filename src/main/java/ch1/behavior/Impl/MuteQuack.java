package ch1.behavior.Impl;

import ch1.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< ,,, >>");
    }
}
