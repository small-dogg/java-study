package designpattern.factorymethod.pizza;

import designpattern.factorymethod.pizza.ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비 중: " + name);
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClam();
        dough = pizzaIngredientFactory.createDough();
    }
}
