package com.neol.patterns.comportamiento.visitor;

final class CalcularCoste implements VisitanteEnvio<Integer> {
    public Integer visitar(Carta carta) {
        return 120;
    }

    public Integer visitar(Paquete paquete) {
        return 350 + paquete.kilos() * 100;
    }
}
