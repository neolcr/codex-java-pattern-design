package com.neol.patterns.comportamiento.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class IteradorRuta implements Iterator<String> {
    private final List<String> paradas;
    private int restantes;

    IteradorRuta(List<String> paradas) {
        this.paradas = paradas;
        restantes = paradas.size();
    }

    public boolean hasNext() {
        return restantes > 0;
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return paradas.get(--restantes);
    }
}
