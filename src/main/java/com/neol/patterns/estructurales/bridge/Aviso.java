package com.neol.patterns.estructurales.bridge;

class Aviso {
    private final Canal canal;

    Aviso(Canal canal) {
        this.canal = canal;
    }

    String enviar(String mensaje) {
        return canal.entregar(mensaje);
    }
}
