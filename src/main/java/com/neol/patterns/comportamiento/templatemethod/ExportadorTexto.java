package com.neol.patterns.comportamiento.templatemethod;

final class ExportadorTexto extends Exportador {
    String cabecera() {
        return "Productos";
    }

    String fila(String producto) {
        return producto;
    }
}
