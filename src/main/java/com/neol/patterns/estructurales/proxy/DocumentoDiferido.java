package com.neol.patterns.estructurales.proxy;

import java.util.function.Supplier;

final class DocumentoDiferido implements Documento {
    private final Supplier<Documento> cargar;
    private Documento documento;

    DocumentoDiferido(Supplier<Documento> cargar) {
        this.cargar = cargar;
    }

    public synchronized String leer() {
        if (documento == null) {
            documento = cargar.get();
        }
        return documento.leer();
    }
}
