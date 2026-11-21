package com.neol.patterns.creacionales.abstractfactory;

final class FabricaEspanola implements FabricaRegion {
    public BotonPago crearBoton() {
        return () -> "Pagar";
    }

    public FormatoMoneda crearFormato() {
        return importe -> importe + " €";
    }
}
