package designpattern.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu{
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자, 투기미첨가 베지버거", true, 3.99);
        addItem("오늘의 스프", "샐러리가 곁들여진 오늘의 스프", false, 3.69);
        addItem("부리토","통 핀토콩과 살사 ,구야카몰이 곁들여진 푸짐한 부리토", true,4.29);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Map<String, MenuItem> getMenuItems() {
        return menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
