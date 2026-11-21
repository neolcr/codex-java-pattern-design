package com.neol.patterns.comportamiento.command;

import java.util.ArrayDeque;
import java.util.Queue;

final class ColaImpresion {
    private final Queue<Orden> pendientes = new ArrayDeque<>();

    void programar(Orden orden) {
        pendientes.add(orden);
    }

    void procesar() {
        while (!pendientes.isEmpty()) {
            pendientes.remove().ejecutar();
        }
    }
}
