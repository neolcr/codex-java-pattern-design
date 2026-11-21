package com.neol.patterns.estructurales.facade;

import java.util.ArrayList;
import java.util.List;

final class Confirmaciones {
    private final List<String> asistentes = new ArrayList<>();

    void enviar(String asistente) {
        asistentes.add(asistente);
    }

    List<String> enviadas() {
        return List.copyOf(asistentes);
    }
}
