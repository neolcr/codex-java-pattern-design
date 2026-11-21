package com.neol.patterns.creacionales.factorymethod;

abstract class Importador {
    int contarContactos(String linea) {
        return crearLector().leer(linea).length;
    }

    protected abstract Lector crearLector();
}
