package designpattern.strategy.fps;

public class Knife implements Weapon{
    @Override
    public void attack() {
        System.out.println("슈슈슉!");
    }
}
