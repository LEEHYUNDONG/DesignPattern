package ch1.behavior.Impl;

import ch1.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추진으로 날라갑니다.");
    }
}
