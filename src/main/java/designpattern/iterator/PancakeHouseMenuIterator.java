package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * Concrete Iterator
 */
public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
    private final List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (menuItems.size() <= position) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목을 지울 수 없습니다.");
    }
}
