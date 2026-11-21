package com.neol.patterns.comportamiento.visitor;

interface Envio {
    <R> R aceptar(VisitanteEnvio<R> visitante);
}
