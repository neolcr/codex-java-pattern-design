package com.neol.patterns.comportamiento.chainofresponsibility;

import java.util.Optional;

abstract class Manejador {
    private final Manejador siguiente;

    Manejador(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    final Optional<String> atender(String categoria) {
        if (acepta(categoria)) {
            return Optional.of(equipo());
        }
        if (siguiente == null) {
            return Optional.empty();
        }
        return siguiente.atender(categoria);
    }

    abstract boolean acepta(String categoria);
    abstract String equipo();
}
