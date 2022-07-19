package designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 반복자 패턴(Iterator Pattern)은 컬렉션의 구현 방법을 노출하지 않으면서 집합체 내의 모든 항목에 접근하는 방법을 제공
 *
 * 반복자 패톤을 사용하면 내부 구현 방법을 외부로 노출하지 않으면서(캡슐화) 집합체에 있는 모든 항목에 일일이 접근할 수 있다.
 * 또한 각 항목에 일일이 접근할 수 있게 해 주는 기능을 집합체가 아닌 반복자 객체가 책임진다는 장점도 있다.
 *
 * 그러면 집합체 인터페이스와 구현이 간단해지고, 각자에게 중요한 일만을 처리할 수 있게 된다.
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();

        List<Menu> menuList = List.of(pancakeHouseMenu, dinerMenu, cafeMenu);

        Waitress waitress = new Waitress(menuList);

        waitress.printMenu();
    }
}
