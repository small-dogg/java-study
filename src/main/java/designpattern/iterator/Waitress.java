package designpattern.iterator;

import java.util.Iterator;

public class Waitress {
    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;
    private final Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerMenuIterator = dinerMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("메뉴\n----\n 펜케이크 메뉴");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\n 저녁 메뉴");
        printMenu(dinerMenuIterator);
        System.out.println("\n 카페 메뉴");
        printMenu(cafeMenuIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    private void printMenu(Iterable<MenuItem> iterable) {
        for (MenuItem menuItem : iterable) {
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

//    private void printMenu(Iterable<MenuItem> iterable) {
//        iterable.forEach(item -> System.out.println(item));
//    }
}
