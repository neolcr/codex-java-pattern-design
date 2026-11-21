package com.neol.patterns.estructurales.composite;

import java.util.List;

record Carpeta(List<Entrada> entradas) implements Entrada {
    Carpeta {
        entradas = List.copyOf(entradas);
    }

    public long bytes() {
        return entradas.stream().mapToLong(Entrada::bytes).sum();
    }
}
