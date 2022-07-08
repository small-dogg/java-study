package designpattern.strategy.fps;

public class Character {
    private Weapon weapon;

    public Character(Weapon weapon) {
        this.weapon = weapon;
    }

    //좌클릭을 수행하면 가지고 있는 무기 또는 맨주먹으로 공격을 수행한다.
    public void leftClick(){
        weapon.attack();
    }

    //무기를 습득하면 자동으로 무기를 장착한다.
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }
}
