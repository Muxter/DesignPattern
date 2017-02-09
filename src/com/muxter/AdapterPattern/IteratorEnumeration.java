package com.muxter.AdapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by matao on 09/02/2017.
 */
public class IteratorEnumeration<T> implements Enumeration<T> {

    private Iterator<T> iterator;

    public IteratorEnumeration(Iterator<T> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public T nextElement() {
        return iterator.next();
    }
}
