package com.neol.patterns.comportamiento.chainofresponsibility;

final class Especialista extends Manejador {
    Especialista(Manejador siguiente) {
        super(siguiente);
    }

    boolean acepta(String categoria) {
        return "Red".equals(categoria);
    }

    String equipo() {
        return "Especialista de red";
    }
}
