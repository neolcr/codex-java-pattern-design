package com.neol.patterns.estructurales.proxy;

record Escaneo(String texto) implements Documento {
    public String leer() {
        return texto;
    }
}
