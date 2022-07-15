package designpattern.templatemethod.starbuzz;

public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if(hook()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }

    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }

    //특정 단계에서 분기를 처리하거나, 단계를 제어할 수 있는 동작을 구상클래스에서 오버라이딩할 수 있도록 제공
    //본 예에서는 커피에 설탕을 추가할 것인지의 사용자에게 질의를 통해 addCondiments 메서드를 수행함
    boolean hook() {
        return true;
    }
}
