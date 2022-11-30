package ch4.pizza;


import ch4.pizza.pizzas.Pizza;
import ch4.pizza.store.NYPizzaStore;
import ch4.pizza.store.PizzaStore;

public class App {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
//        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");


        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");


        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

    }
}
