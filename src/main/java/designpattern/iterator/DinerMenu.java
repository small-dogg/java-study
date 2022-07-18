package designpattern.iterator;

import java.util.Iterator;

/**
 * Concrete Aggregate
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토", true, 2.99);
        addItem("BLT","통밀 위에 베이컨, 상추, 토마토",false, 2.99);
        addItem("오늘의 스프", "감자 샐러드 와 스프", false, 3.29);
        addItem("핫도그", "사워크라우트, 갖은 양념, 치즈가 곁들여진 핫도그", false, 3.05);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("메뉴가 꽉차 더이상 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
