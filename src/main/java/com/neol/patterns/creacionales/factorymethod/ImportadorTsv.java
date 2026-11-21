package com.neol.patterns.creacionales.factorymethod;

final class ImportadorTsv extends Importador {
    @Override
    protected Lector crearLector() {
        return linea -> linea.split("\t", -1);
    }
}
