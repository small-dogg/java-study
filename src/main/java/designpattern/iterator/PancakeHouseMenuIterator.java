package designpattern.iterator;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator {
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
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
