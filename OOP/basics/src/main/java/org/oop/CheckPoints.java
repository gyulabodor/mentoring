package org.oop;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CheckPoints implements Collection<CheckPointA> {

    CheckPointA[] list;

    CheckPoints(){
        this.list = new CheckPointA[10];
    }




    @Override
    public String toString() {
        return "CheckPoints{" +
                "list=" + Arrays.toString(list) +
                '}';
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<CheckPointA> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(CheckPointA checkPointA) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends CheckPointA> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeIf(Predicate<? super CheckPointA> filter) {
        return Collection.super.removeIf(filter);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Spliterator<CheckPointA> spliterator() {
        return Collection.super.spliterator();
    }

    @Override
    public Stream<CheckPointA> stream() {
        return Collection.super.stream();
    }

    @Override
    public Stream<CheckPointA> parallelStream() {
        return Collection.super.parallelStream();
    }
}
