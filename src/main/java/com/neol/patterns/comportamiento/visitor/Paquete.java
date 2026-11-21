package com.neol.patterns.comportamiento.visitor;

record Paquete(String destino, int kilos) implements Envio {
    Paquete {
        if (kilos <= 0) {
            throw new IllegalArgumentException("El peso debe ser positivo");
        }
    }

    public <R> R aceptar(VisitanteEnvio<R> visitante) {
        return visitante.visitar(this);
    }
}
