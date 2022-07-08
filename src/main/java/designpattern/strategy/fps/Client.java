package designpattern.strategy.fps;

public class Client{
    public static void main(String[] args){
        //사용자가 캐릭터를 지정하였다.
        Character bob = new Character(new Fist());

        //무기가 없는 상태에서 좌클릭을 수행하였다.
        bob.leftClick();

        //나이프를 획득하였다.
        bob.setWeapon(new Knife());
        //나이프를 든 채로 좌클릭을 수행하였다.
        bob.leftClick();

        bob.setWeapon(new M4A1());
        bob.leftClick();

        bob.setWeapon(new Kar98k());
        bob.leftClick();
    }
}