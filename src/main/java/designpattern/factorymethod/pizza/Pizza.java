package designpattern.factorymethod.pizza;

import designpattern.factorymethod.pizza.ingredient.cheese.Cheese;
import designpattern.factorymethod.pizza.ingredient.clams.Clams;
import designpattern.factorymethod.pizza.ingredient.dough.Dough;
import designpattern.factorymethod.pizza.ingredient.pepperoni.Pepperoni;
import designpattern.factorymethod.pizza.ingredient.sauce.Sauce;
import designpattern.factorymethod.pizza.ingredient.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;


    List<String> toppings = new ArrayList<String>();

    abstract void prepare();

    void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }
    void cut() {
        System.out.println("피자를 8등분 하여 자르기");
    }
    void box() {
        System.out.println("상자에 피자 담기");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
