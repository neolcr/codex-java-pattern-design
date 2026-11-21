package com.neol.patterns.comportamiento.visitor;

final class DescribirEnvio implements VisitanteEnvio<String> {
    public String visitar(Carta carta) {
        return "Carta a " + carta.destino();
    }

    public String visitar(Paquete paquete) {
        return "Paquete de %d kg a %s".formatted(paquete.kilos(), paquete.destino());
    }
}
