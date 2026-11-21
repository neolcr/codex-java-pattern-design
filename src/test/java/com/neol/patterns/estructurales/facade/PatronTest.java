package com.neol.patterns.estructurales.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void confirmaSoloLasInscripcionesConPlaza() {
        var confirmaciones = new Confirmaciones();
        var taller = new InscripcionTaller(new Aforo(1), confirmaciones);
        assertTrue(taller.inscribir("Ana"));
        assertFalse(taller.inscribir("Luis"));
        assertEquals(java.util.List.of("Ana"), confirmaciones.enviadas());
    }
}
