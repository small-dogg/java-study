package designpattern.factorymethod.pizza;

import designpattern.factorymethod.pizza.ingredient.PizzaIngredientFactory;

public class BulgogiPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public BulgogiPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비중 ... " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
