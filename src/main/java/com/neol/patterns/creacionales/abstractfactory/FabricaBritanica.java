package com.neol.patterns.creacionales.abstractfactory;

final class FabricaBritanica implements FabricaRegion {
    public BotonPago crearBoton() {
        return () -> "Pay";
    }

    public FormatoMoneda crearFormato() {
        return importe -> "£" + importe;
    }
}
