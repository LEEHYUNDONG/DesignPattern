package ch1.duck;

import ch1.behavior.Impl.FlyNoWay;
import ch1.behavior.Impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    @Override
    public void display() {
        System.out.println("저건 모형 오리입니다");
    }

}
