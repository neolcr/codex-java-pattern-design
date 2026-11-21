package com.neol.patterns.comportamiento.chainofresponsibility;

final class MesaAyuda extends Manejador {
    MesaAyuda(Manejador siguiente) {
        super(siguiente);
    }

    boolean acepta(String categoria) {
        return "Cuenta".equals(categoria);
    }

    String equipo() {
        return "Mesa de ayuda";
    }
}
