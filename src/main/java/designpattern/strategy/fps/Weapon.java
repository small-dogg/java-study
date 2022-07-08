package designpattern.strategy.fps;

public interface Weapon {
    default void attack(){
        System.out.println("맨손 공격 얍얍!");
    }
}
