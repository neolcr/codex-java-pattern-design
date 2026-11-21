package com.neol.patterns.creacionales.factorymethod;

final class ImportadorCsv extends Importador {
    @Override
    protected Lector crearLector() {
        return linea -> linea.split(",", -1);
    }
}
