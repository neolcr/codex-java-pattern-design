package com.neol.patterns.comportamiento.command;

record Imprimir(Impresora impresora, String texto) implements Orden {
    public void ejecutar() {
        impresora.imprimir(texto);
    }
}
