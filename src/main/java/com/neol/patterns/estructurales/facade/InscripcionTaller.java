package com.neol.patterns.estructurales.facade;

record InscripcionTaller(Aforo aforo, Confirmaciones confirmaciones) {
    boolean inscribir(String asistente) {
        if (!aforo.reservar()) {
            return false;
        }
        confirmaciones.enviar(asistente);
        return true;
    }
}
