package com.neol.patterns.comportamiento.templatemethod;

final class ExportadorMarkdown extends Exportador {
    String cabecera() {
        return "# Productos";
    }

    String fila(String producto) {
        return "- " + producto;
    }
}
