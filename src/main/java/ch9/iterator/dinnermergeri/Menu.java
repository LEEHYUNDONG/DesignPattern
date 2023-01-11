package ch9.iterator.dinnermergeri;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
