package com.zmags.task;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Genaric Bag class
 * using array list underline as a collection
 */

public class Bag<E> implements Collection<E> {

    private final ArrayList<E> items;

    public Bag() {

        items = new ArrayList<>();
    }

    public E get(int index) {

        return items.get(index);
    }

    public E set(int index, E newVal) {
        return items.set(index, newVal);
    }

    @Override
    public int size() {

        return items.size();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return items.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return items.iterator();
    }

    @Override
    public Object[] toArray() {
        return items.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return items.toArray(a);
    }

    @Override
    public boolean add(E e) {
        return items.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return items.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return items.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return items.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return items.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return items.retainAll(c);
    }

    @Override
    public void clear() {
        items.clear();
    }

}
