package designpattern.factorymethod.pizza;

public class Client {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new ChicagoPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());

    }
}
