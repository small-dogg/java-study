package designpattern.factorymethod.pizza.ingredient;

import designpattern.factorymethod.pizza.ingredient.*;
import designpattern.factorymethod.pizza.ingredient.cheese.Cheese;
import designpattern.factorymethod.pizza.ingredient.cheese.Reggianocheese;
import designpattern.factorymethod.pizza.ingredient.clams.Clams;
import designpattern.factorymethod.pizza.ingredient.clams.FreshClams;
import designpattern.factorymethod.pizza.ingredient.dough.Dough;
import designpattern.factorymethod.pizza.ingredient.dough.ThinCrustDough;
import designpattern.factorymethod.pizza.ingredient.pepperoni.Pepperoni;
import designpattern.factorymethod.pizza.ingredient.pepperoni.SlicedPepperoni;
import designpattern.factorymethod.pizza.ingredient.sauce.MarinaraSauce;
import designpattern.factorymethod.pizza.ingredient.sauce.Sauce;
import designpattern.factorymethod.pizza.ingredient.veggies.*;

public class NyPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Reggianocheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new EggPlant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
