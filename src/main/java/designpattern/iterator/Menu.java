package designpattern.iterator;

import java.util.Iterator;

/**
 * Aggregate Interface
 */
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
