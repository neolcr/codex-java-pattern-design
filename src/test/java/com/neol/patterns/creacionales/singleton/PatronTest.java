package com.neol.patterns.creacionales.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void comparteLaSecuencia() {
        var primero = Numerador.INSTANCIA;
        var segundo = Numerador.valueOf("INSTANCIA");
        assertSame(primero, segundo);
        assertEquals(primero.siguiente() + 1, segundo.siguiente());
    }
}
