package com.neol.patterns.comportamiento.visitor;

record Carta(String destino) implements Envio {
    public <R> R aceptar(VisitanteEnvio<R> visitante) {
        return visitante.visitar(this);
    }
}
