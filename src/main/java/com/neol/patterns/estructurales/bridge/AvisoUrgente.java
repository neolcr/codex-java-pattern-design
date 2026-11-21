package com.neol.patterns.estructurales.bridge;

final class AvisoUrgente extends Aviso {
    AvisoUrgente(Canal canal) {
        super(canal);
    }

    @Override
    String enviar(String mensaje) {
        return super.enviar("[Urgente] " + mensaje);
    }
}
