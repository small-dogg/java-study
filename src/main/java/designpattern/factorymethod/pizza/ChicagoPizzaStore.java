package designpattern.factorymethod.pizza;

import designpattern.factorymethod.pizza.ingredient.ChicagoPizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("뉴욕 스타일 치즈 피자");
        } else if (type.equals("bulgogi")) {
            pizza = new BulgogiPizza(new ChicagoPizzaIngredientFactory());
            pizza.setName("뉴욕 스타일 불고기 피자");
        }else{
            throw new IllegalArgumentException("옳바르지 않은 피자 주문 입니다.");
        }
        return pizza;
    }
}
