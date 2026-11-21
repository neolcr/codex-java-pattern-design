package com.neol.patterns.comportamiento.iterator;

import java.util.Iterator;
import java.util.List;

record Ruta(List<String> paradas) implements Iterable<String> {
    Ruta {
        paradas = List.copyOf(paradas);
    }

    public Iterator<String> iterator() {
        return new IteradorRuta(paradas);
    }
}
