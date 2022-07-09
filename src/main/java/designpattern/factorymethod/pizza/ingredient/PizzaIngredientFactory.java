package designpattern.factorymethod.pizza.ingredient;

import designpattern.factorymethod.pizza.ingredient.cheese.Cheese;
import designpattern.factorymethod.pizza.ingredient.clams.Clams;
import designpattern.factorymethod.pizza.ingredient.dough.Dough;
import designpattern.factorymethod.pizza.ingredient.pepperoni.Pepperoni;
import designpattern.factorymethod.pizza.ingredient.sauce.Sauce;
import designpattern.factorymethod.pizza.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
