package com.neol.patterns.comportamiento.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void cambiaLaTarifaYRespetaElUmbralDelEnvioEstandar() {
        var caja = new Caja(new EnvioEstandar());
        assertEquals(5_449, caja.total(4_999));
        assertEquals(5_000, caja.total(5_000));
        caja.elegirTarifa(new Recogida());
        assertEquals(4_999, caja.total(4_999));
    }
}
