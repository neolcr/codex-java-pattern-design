package com.neol.patterns.comportamiento.chainofresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void resuelveEnElPrimerManejadorCapazODevuelveVacio() {
        var soporte = new MesaAyuda(new Especialista(null));
        assertEquals("Mesa de ayuda", soporte.atender("Cuenta").orElseThrow());
        assertEquals("Especialista de red", soporte.atender("Red").orElseThrow());
        assertTrue(soporte.atender("Otro").isEmpty());
    }
}
