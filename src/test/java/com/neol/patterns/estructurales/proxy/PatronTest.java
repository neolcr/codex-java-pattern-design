package com.neol.patterns.estructurales.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {
    @Test
    void cargaUnaVezAlLeerPorPrimeraVez() {
        var cargas = new java.util.concurrent.atomic.AtomicInteger();
        Documento documento = new DocumentoDiferido(() -> {
            cargas.incrementAndGet();
            return new Escaneo("Acta");
        });
        assertEquals(0, cargas.get());
        assertEquals("Acta", documento.leer());
        assertEquals("Acta", documento.leer());
        assertEquals(1, cargas.get());
    }
}
