package ch1;


import ch1.behavior.Impl.FlyRocketPowered;
import ch1.duck.Duck;
import ch1.duck.MallardDuck;
import ch1.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();

        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
