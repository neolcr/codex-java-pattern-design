package com.neol.patterns.comportamiento.visitor;

interface VisitanteEnvio<R> {
    R visitar(Carta carta);
    R visitar(Paquete paquete);
}
