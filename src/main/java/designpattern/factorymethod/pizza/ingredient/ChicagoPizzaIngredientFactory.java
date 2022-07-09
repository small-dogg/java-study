package designpattern.factorymethod.pizza.ingredient;

import designpattern.factorymethod.pizza.ingredient.cheese.Cheese;
import designpattern.factorymethod.pizza.ingredient.cheese.MozzarellaCheese;
import designpattern.factorymethod.pizza.ingredient.clams.Clams;
import designpattern.factorymethod.pizza.ingredient.clams.FrozenClams;
import designpattern.factorymethod.pizza.ingredient.dough.Dough;
import designpattern.factorymethod.pizza.ingredient.dough.ThickCrustDough;
import designpattern.factorymethod.pizza.ingredient.pepperoni.Pepperoni;
import designpattern.factorymethod.pizza.ingredient.pepperoni.SlicedPepperoni;
import designpattern.factorymethod.pizza.ingredient.sauce.PlumTomatoSauce;
import designpattern.factorymethod.pizza.ingredient.sauce.Sauce;
import designpattern.factorymethod.pizza.ingredient.veggies.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
