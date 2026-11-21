package com.neol.patterns.comportamiento.templatemethod;

import java.util.List;

abstract class Exportador {
    final String exportar(List<String> productos) {
        var salida = new StringBuilder(cabecera());
        for (String producto : productos) {
            salida.append('\n').append(fila(producto));
        }
        return salida.toString();
    }

    abstract String cabecera();
    abstract String fila(String producto);
}
