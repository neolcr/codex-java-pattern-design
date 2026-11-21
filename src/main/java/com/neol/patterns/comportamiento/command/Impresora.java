package com.neol.patterns.comportamiento.command;

import java.util.ArrayList;
import java.util.List;

final class Impresora {
    private final List<String> paginas = new ArrayList<>();

    void imprimir(String texto) {
        paginas.add(texto);
    }

    List<String> paginas() {
        return List.copyOf(paginas);
    }
}
