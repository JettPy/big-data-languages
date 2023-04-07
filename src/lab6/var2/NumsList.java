package lab6.var2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Лабораторная работа 6
// Вариант 2
// Задание 1
public class NumsList implements Collection {
    private List<Integer> store;

    public NumsList() {
        store = new ArrayList<>();
    }
    @Override
    public int size() {
        return store.size();
    }

    @Override
    public boolean isEmpty() {
        return store.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return store.contains(o);
    }

    @Override
    public Iterator iterator() {
        return store.iterator();
    }

    @Override
    public void forEach(Consumer action) {
        store.forEach(action);
    }

    @Override
    public Object[] toArray() {
        return store.toArray();
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        return store.toArray(generator);
    }

    @Override
    public boolean add(Object o) {
        return store.add((int) o);
    }

    @Override
    public boolean remove(Object o) {
        return store.remove(o);
    }

    @Override
    public boolean addAll(Collection collection) {
        return store.addAll(collection);
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return store.removeIf(filter);
    }

    @Override
    public void clear() {
        store.clear();
    }

    @Override
    public Spliterator spliterator() {
        return store.spliterator();
    }

    @Override
    public Stream stream() {
        return store.stream();
    }

    @Override
    public Stream parallelStream() {
        return store.parallelStream();
    }

    @Override
    public boolean retainAll(Collection collection) {
        return store.retainAll(collection);
    }

    @Override
    public boolean removeAll(Collection collection) {
        return store.retainAll(collection);
    }

    @Override
    public boolean containsAll(Collection collection) {
        return store.contains(collection);
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return store.toArray(objects);
    }

    public int closest(int value) {
        Iterator iterator = this.iterator();
        int minimal = (int)iterator.next();
        while (iterator.hasNext()) {
            int element = (int)iterator.next();
            if (Math.abs(element - value) < Math.abs(minimal - value)) {
                minimal = element;
            }
        }
        return minimal;
    }
}
