package designpattern.templatemethod.starbuzz;

public abstract class CaffeineBeverage {

    //단계별로 구성된 알고리즘(템플릿)
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    //일부 단계는 구상클래스에서 직접 구현한다.
    abstract void brew();

    //일부 단계는 구상클래스에서 직접 구현한다.
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
}
